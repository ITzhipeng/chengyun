package com.chengyun.chengyun.controller;

import com.alibaba.fastjson.JSONObject;
import com.chengyun.chengyun.domain.Jqjc;
import com.chengyun.chengyun.service.GisApiService;
import com.chengyun.chengyun.until.LatLonUtil;
import com.chengyun.chengyun.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

@RestController
public class GisApiController {
    @Autowired
    private GisApiService gisApiService;

    /**
     * 警情监测接口
     * @param longitude
     * @param latitude
     * @param radius
     * @return
     * @throws SQLException
     */
    @PostMapping("publicOpinion")
    public ResultVo<List<Jqjc>> getPublicOpinion(@RequestParam(defaultValue = "") String longitude,
                                                 @RequestParam(defaultValue = "") String latitude,
                                                 @RequestParam(defaultValue = "") String radius) throws SQLException {

        if (longitude == null || longitude.equals("")) {
            return ResultVo.getFailed("参数longitude不可为空");
        } else if (latitude == null || latitude.equals("")) {
            return ResultVo.getFailed("参数latitude不可为空");
        } else if (radius == null || radius.equals("")) {
            return ResultVo.getFailed("参数radius不可为空");
        } else {
            double r = Double.valueOf(radius);
            double lat = Double.valueOf(latitude);
            double lon = Double.valueOf(longitude);
            HashMap<String, String> map = LatLonUtil.GetAround(lat, lon, r);
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("list", gisApiService.getPublicOpinion(map.get("maxLng"), map.get("minLng"), map.get("maxLat"), map.get("minLat")));
            return ResultVo.getSuccess("数据获取成功", jsonObject);
        }
    }
}

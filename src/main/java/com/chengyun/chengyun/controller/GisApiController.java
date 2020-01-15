package com.chengyun.chengyun.controller;

import com.alibaba.fastjson.JSONObject;
import com.chengyun.chengyun.domain.Jqjc;
import com.chengyun.chengyun.domain.WhclJbxx;
import com.chengyun.chengyun.service.ApiService;
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

    @PostMapping("publicOpinion")
    public ResultVo<List<Jqjc>> getPublicOpinion(@RequestParam(value = "longitude") String longitude,
                                                 @RequestParam(value = "latitude") String latitude,
                                                 @RequestParam(value ="radius") String radius) throws SQLException {
        double r=Double.valueOf(radius);
        double lat=Double.valueOf(latitude);
        double lon=Double.valueOf(longitude);

        HashMap<String,String> map=LatLonUtil.GetAround(lat,lon,r);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("list",gisApiService.getPublicOpinion(map.get("maxLng"),map.get("minLng"),map.get("maxLat"),map.get("minLat")));
        return ResultVo.getSuccess("数据获取成功",jsonObject);
    }
}

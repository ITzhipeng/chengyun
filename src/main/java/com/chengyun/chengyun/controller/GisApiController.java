package com.chengyun.chengyun.controller;

import com.alibaba.fastjson.JSONObject;
import com.chengyun.chengyun.domain.Cldwjgj;
import com.chengyun.chengyun.domain.Jqjc;
import com.chengyun.chengyun.domain.Pcs;
import com.chengyun.chengyun.service.GisApiService;
import com.chengyun.chengyun.until.LatLonUtil;
import com.chengyun.chengyun.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
@CrossOrigin
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

    /**
     * 社会紧急救援
     * @param longitude
     * @param latitude
     * @param radius
     * @return
     * @throws SQLException
     */
    @PostMapping("emergencyteam")
    public ResultVo<List<Jqjc>> getEmergencyteam(@RequestParam(defaultValue = "") String longitude,
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
            jsonObject.put("list", gisApiService.getEmergencyteam(map.get("maxLng"), map.get("minLng"), map.get("maxLat"), map.get("minLat")));
            return ResultVo.getSuccess("数据获取成功", jsonObject);
        }
    }

    /**
     * 化工救援
     * @param longitude
     * @param latitude
     * @param radius
     * @return
     * @throws SQLException
     */
    @PostMapping("rescueteam")
    public ResultVo<List<Jqjc>> getRescueteam(@RequestParam(defaultValue = "") String longitude,
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
            jsonObject.put("list", gisApiService.getRescueteam(map.get("maxLng"), map.get("minLng"), map.get("maxLat"), map.get("minLat")));
            return ResultVo.getSuccess("数据获取成功", jsonObject);
        }
    }
    /**
     * 医院
     * @param longitude
     * @param latitude
     * @param radius
     * @return
     * @throws SQLException
     */
    @PostMapping("hospital")
    public ResultVo<List<Jqjc>> getHospital(@RequestParam(defaultValue = "") String longitude,
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
            jsonObject.put("list", gisApiService.getHospital(map.get("maxLng"), map.get("minLng"), map.get("maxLat"), map.get("minLat")));
            return ResultVo.getSuccess("数据获取成功", jsonObject);
        }
    }

    /**
     * 车辆定位及轨迹信息
     * @param longitude
     * @param latitude
     * @param radius
     * @return
     * @throws SQLException
     */
    @PostMapping("vehicle/coordinates")
    public ResultVo<List<Cldwjgj>> getVehicleCoordinates(@RequestParam(defaultValue = "") String type,
                                                         @RequestParam(defaultValue = "") String longitude,
                                                         @RequestParam(defaultValue = "") String latitude,
                                                         @RequestParam(defaultValue = "") String radius) throws SQLException {
        if (type == null || type.equals("")) {
            return ResultVo.getFailed("参数type不可为空");
        }else if(longitude == null || longitude.equals("")) {
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
            jsonObject.put("list", gisApiService.getVehicleCoordinates(type,map.get("maxLng"), map.get("minLng"), map.get("maxLat"), map.get("minLat")));
            return ResultVo.getSuccess("数据获取成功", jsonObject);
        }
    }

    /**
     * 消防队
     * @param longitude
     * @param latitude
     * @param radius
     * @return
     * @throws SQLException
     */
    @PostMapping("firestation")
    public ResultVo<List<Jqjc>> getFirestation(@RequestParam(defaultValue = "") String longitude,
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
            jsonObject.put("list", gisApiService.getFirestation(map.get("maxLng"), map.get("minLng"), map.get("maxLat"), map.get("minLat")));
            return ResultVo.getSuccess("数据获取成功", jsonObject);
        }
    }

    /**
     * 派出所
     * @param longitude
     * @param latitude
     * @param radius
     * @return
     * @throws SQLException
     */
    @PostMapping("policestation")
    public ResultVo<List<Pcs>> getPolicestation(@RequestParam(defaultValue = "") String longitude,
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
            jsonObject.put("list", gisApiService.getPolicestation(map.get("maxLng"), map.get("minLng"), map.get("maxLat"), map.get("minLat")));
            return ResultVo.getSuccess("数据获取成功", jsonObject);
        }
    }

    /**
     * 未来24小时天气状况接口
     * @param longitude
     * @param latitude
     * @return
     * @throws SQLException
     */
    @PostMapping("atmosphere/24hourforcast")
    public ResultVo<List<Pcs>> getAtmosphere(@RequestParam(defaultValue = "") Double longitude,
                                                @RequestParam(defaultValue = "") Double latitude) throws SQLException {

        if (longitude == null || longitude.equals("")) {
            return ResultVo.getFailed("参数longitude不可为空");
        } else if (latitude == null || latitude.equals("")) {
            return ResultVo.getFailed("参数latitude不可为空");
        }else {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("list", gisApiService.getAtmosphere(longitude,latitude));
            return ResultVo.getSuccess("数据获取成功", jsonObject);
        }
    }
}

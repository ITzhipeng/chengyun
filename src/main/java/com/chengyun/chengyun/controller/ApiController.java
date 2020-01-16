package com.chengyun.chengyun.controller;

import com.alibaba.fastjson.JSONObject;
import com.chengyun.chengyun.domain.*;
import com.chengyun.chengyun.service.ApiService;
import com.chengyun.chengyun.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;
@CrossOrigin
@RestController
public class ApiController {
    @Autowired
    private ApiService apiService;

    /**
     * 危化车辆基本信息接口
     * @return
     * @throws SQLException
     */
    @PostMapping("vehicle/basicinfo")
    public ResultVo<List<WhclJbxx>> getVehicle() throws SQLException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("list",apiService.getVehicle());
        return ResultVo.getSuccess("数据获取成功",jsonObject);
    }

    /**
     * 企业基本信息接口
     * @return
     * @throws SQLException
     */

    @PostMapping("enterprise/basicinfo")
    public ResultVo<List<QyJcxx>> getEnterprise() throws SQLException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("list",apiService.getEnterprise());
        return ResultVo.getSuccess("数据获取成功",jsonObject);
    }

    /**
     * 危化品企业预案接口
     * @return
     * @throws SQLException
     */
    @PostMapping("enterprise/plan")
    public ResultVo<List<Whpqyya>> getEnterprisePlan() throws SQLException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("list",apiService.getEnterprisePlan());
        return ResultVo.getSuccess("数据获取成功",jsonObject);
    }


    /**
     * 网络舆情热点
     * @return
     * @throws SQLException
     */
    @PostMapping("internetnews")
    public ResultVo<List<Wlyqrd>> getInternetnews() throws SQLException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("list",apiService.getInternetnews());
        return ResultVo.getSuccess("数据获取成功",jsonObject);
    }

    /**
     * 空气质量指数
     * @return
     * @throws SQLException
     */
    @PostMapping("atmosphere/AQI")
    public ResultVo<List<Kqzlzs>> getAtmosphereAQI() throws SQLException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("list",apiService.getAtmosphereAQI());
        return ResultVo.getSuccess("数据获取成功",jsonObject);
    }

    /**
     * 气象十天预报
     * @return
     * @throws SQLException
     */
    @PostMapping("atmosphere/10dayforcast")
    public ResultVo<List<Kqzlzs>> getAtmosphereTedDaysforcast() throws SQLException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("list",apiService.getAtmosphereTedDaysforcast());
        return ResultVo.getSuccess("数据获取成功",jsonObject);
    }

    /**
     * 气象预警
     * @return
     * @throws SQLException
     */
    @PostMapping("atmosphere/warning")
    public ResultVo<List<Kqzlzs>> getAtmosphereWarning() throws SQLException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("list",apiService.getAtmosphereWarning());
        return ResultVo.getSuccess("数据获取成功",jsonObject);
    }

}

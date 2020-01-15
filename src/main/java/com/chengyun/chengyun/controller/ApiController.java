package com.chengyun.chengyun.controller;

import com.alibaba.fastjson.JSONObject;
import com.chengyun.chengyun.domain.QyJcxx;
import com.chengyun.chengyun.domain.WhclJbxx;
import com.chengyun.chengyun.domain.Whpqyya;
import com.chengyun.chengyun.service.ApiService;
import com.chengyun.chengyun.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.List;

@RestController
public class ApiController {
    @Autowired
    private ApiService apiService;
    @PostMapping("vehicle/basicinfo")
    public ResultVo<List<WhclJbxx>> getVehicle() throws SQLException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("list",apiService.getVehicle());
        return ResultVo.getSuccess("数据获取成功",jsonObject);
    }


    @PostMapping("enterprise/basicinfo")
    public ResultVo<List<QyJcxx>> getEnterprise() throws SQLException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("list",apiService.getEnterprise());
        return ResultVo.getSuccess("数据获取成功",jsonObject);
    }

    @PostMapping("enterprise/plan")
    public ResultVo<List<Whpqyya>> getEnterprisePlan() throws SQLException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("list",apiService.getEnterprisePlan());
        return ResultVo.getSuccess("数据获取成功",jsonObject);
    }


}

package com.chengyun.chengyun.controller;

import com.alibaba.fastjson.JSONObject;
import com.chengyun.chengyun.domain.WhclJbxx;
import com.chengyun.chengyun.service.ApiService;
import com.chengyun.chengyun.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
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
}

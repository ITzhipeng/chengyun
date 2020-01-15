package com.chengyun.chengyun.service.impl;

import com.chengyun.chengyun.domain.WhclJbxx;
import com.chengyun.chengyun.mapper.ApiMapper;
import com.chengyun.chengyun.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {
    @Autowired
    private ApiMapper apiMapper;
    @Override
    public List<WhclJbxx> getVehicle() throws SQLException {
        return apiMapper.getVehicle();
    }

    @Override
    public List<LinkedHashMap<String, String>> getEnterprise() throws SQLException {
        return apiMapper.getEnterprise();
    }
}

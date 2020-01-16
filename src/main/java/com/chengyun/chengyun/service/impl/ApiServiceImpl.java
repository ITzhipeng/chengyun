package com.chengyun.chengyun.service.impl;

import com.chengyun.chengyun.domain.*;
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
    public List<QyJcxx> getEnterprise() throws SQLException {
        return apiMapper.getEnterprise();
    }

    @Override
    public List<Whpqyya> getEnterprisePlan() throws SQLException {
        return apiMapper.getEnterprisePlan();
    }

    @Override
    public List<Wlyqrd> getInternetnews() throws SQLException {
        return apiMapper.getInternetnews();
    }

    @Override
    public List<Kqzlzs> getAtmosphereAQI() throws SQLException {
        return apiMapper.getAtmosphereAQI();
    }

    @Override
    public List<Qxstyb> getAtmosphereTedDaysforcast() throws SQLException {
        return apiMapper.getAtmosphereTedDaysforcast();
    }

    @Override
    public List<Qxyj> getAtmosphereWarning() throws SQLException {
        return apiMapper.getAtmosphereWarning();
    }
}

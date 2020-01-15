package com.chengyun.chengyun.service.impl;

import com.chengyun.chengyun.domain.Hgjy;
import com.chengyun.chengyun.domain.Hospital;
import com.chengyun.chengyun.domain.Jqjc;
import com.chengyun.chengyun.domain.Shyjjy;
import com.chengyun.chengyun.mapper.ApiMapper;
import com.chengyun.chengyun.mapperpg.GisApiMapper;
import com.chengyun.chengyun.service.GisApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class GisApiServiceImpl implements GisApiService {
    @Autowired
    private GisApiMapper gisApiMapper;

    @Override
    public List<Jqjc> getPublicOpinion(String lonMax,String lonMin,String latMax,String latMin) throws SQLException {
        return gisApiMapper.getPublicOpinion(lonMax,lonMin,latMax,latMin);
    }

    @Override
    public List<Shyjjy> getEmergencyteam(String lonMax, String lonMin, String latMax, String latMin) throws SQLException {
        return gisApiMapper.getEmergencyteam(lonMax,lonMin,latMax,latMin);
    }

    @Override
    public List<Hgjy> getRescueteam(String lonMax, String lonMin, String latMax, String latMin) throws SQLException {
        return gisApiMapper.getRescueteam(lonMax,lonMin,latMax,latMin);
    }

    @Override
    public List<Hospital> getHospital(String lonMax, String lonMin, String latMax, String latMin) throws SQLException {
        return gisApiMapper.getHospital(lonMax,lonMin,latMax,latMin);
    }
}

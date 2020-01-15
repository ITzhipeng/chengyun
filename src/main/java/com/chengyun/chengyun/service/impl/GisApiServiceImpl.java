package com.chengyun.chengyun.service.impl;

import com.chengyun.chengyun.domain.Jqjc;
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
}

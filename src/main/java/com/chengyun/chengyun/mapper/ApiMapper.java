package com.chengyun.chengyun.mapper;

import com.chengyun.chengyun.domain.WhclJbxx;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.List;

@Mapper
public interface ApiMapper {
    List<WhclJbxx> getVehicle() throws SQLException;
    List<LinkedHashMap<String,String>> getEnterprise()throws SQLException;

}

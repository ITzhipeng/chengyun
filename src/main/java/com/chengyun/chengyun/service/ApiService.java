package com.chengyun.chengyun.service;


import com.chengyun.chengyun.domain.*;

import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.List;

public interface ApiService {

    //危化车辆基本信息
    List<WhclJbxx> getVehicle() throws SQLException;

    //企业基本信息
    List<QyJcxx> getEnterprise() throws SQLException;

    //危化品企业预案信息
    List<Whpqyya> getEnterprisePlan() throws SQLException;

    //网络舆情热点
    List<Wlyqrd> getInternetnews() throws SQLException;

    //空气质量指数
    List<Kqzlzs> getAtmosphereAQI() throws SQLException;

    //气象十天预报
    List<Qxstyb> getAtmosphereTedDaysforcast() throws SQLException;

    //气象预警
    List<Qxyj> getAtmosphereWarning() throws SQLException;

}

package com.chengyun.chengyun.service;


import com.chengyun.chengyun.domain.QyJcxx;
import com.chengyun.chengyun.domain.WhclJbxx;
import com.chengyun.chengyun.domain.Whpqyya;

import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.List;

public interface ApiService {

    //危化车辆基本信息
    List<WhclJbxx> getVehicle() throws SQLException;

    //企业基本信息
    List<QyJcxx> getEnterprise()throws SQLException;

    //企业基本信息
    List<Whpqyya> getEnterprisePlan()throws SQLException;

}

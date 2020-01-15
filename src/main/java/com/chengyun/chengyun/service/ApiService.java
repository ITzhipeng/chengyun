package com.chengyun.chengyun.service;


import com.chengyun.chengyun.domain.WhclJbxx;

import java.sql.SQLException;
import java.util.List;

public interface ApiService {

    //危化车辆基本信息
    List<WhclJbxx> getVehicle() throws SQLException;
}

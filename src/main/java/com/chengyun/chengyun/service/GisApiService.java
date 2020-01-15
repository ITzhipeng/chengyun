package com.chengyun.chengyun.service;

import com.chengyun.chengyun.domain.*;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

public interface GisApiService {
    //企业基本信息
    List<Jqjc> getPublicOpinion(String lonMax,String lonMin,String latMax,String latMin)throws SQLException;

    //车辆定位及轨迹信息
    List<Cldwjgj> getVehicleCoordinates(String type,String lonMax, String lonMin, String latMax, String latMin)throws SQLException;

    //消防队
    List<Xfd> getFirestation(String lonMax,String lonMin,String latMax,String latMin) throws SQLException;

    //派出所
    List<Pcs> getPolicestation(String lonMax,String lonMin,String latMax,String latMin) throws SQLException;

}

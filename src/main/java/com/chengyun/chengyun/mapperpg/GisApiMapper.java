package com.chengyun.chengyun.mapperpg;

import com.chengyun.chengyun.domain.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface GisApiMapper {
    //警情监测
    List<Jqjc> getPublicOpinion(@Param("lonMax") String lonMax,
                                @Param("lonMin") String lonMin,
                                @Param("latMax") String latMax,
                                @Param("latMin") String latMin) throws SQLException;

    //车辆定位及轨迹
    List<Cldwjgj> getVehicleCoordinates(@Param("type") String type,
                                        @Param("lonMax") String lonMax,
                                        @Param("lonMin") String lonMin,
                                        @Param("latMax") String latMax,
                                        @Param("latMin") String latMin) throws SQLException;

    //消防队
    List<Xfd> getFirestation(
            @Param("lonMax") String lonMax,
            @Param("lonMin") String lonMin,
            @Param("latMax") String latMax,
            @Param("latMin") String latMin) throws SQLException;

    //社会应急救援力量
    List<Shyjjy> getEmergencyteam(@Param("lonMax") String lonMax,
                                  @Param("lonMin") String lonMin,
                                  @Param("latMax") String latMax,
                                  @Param("latMin") String latMin)throws SQLException;

    //化工救援队数据接口
    List<Hgjy> getRescueteam(@Param("lonMax") String lonMax,
                             @Param("lonMin") String lonMin,
                             @Param("latMax") String latMax,
                             @Param("latMin") String latMin)throws SQLException;

    //医院数据接口
    List<Hospital> getHospital(@Param("lonMax") String lonMax,
                               @Param("lonMin") String lonMin,
                               @Param("latMax") String latMax,
                               @Param("latMin") String latMin)throws SQLException;


    //派出所接口
    List<Pcs> getPolicestation(
            @Param("lonMax") String lonMax,
            @Param("lonMin") String lonMin,
            @Param("latMax") String latMax,
            @Param("latMin") String latMin) throws SQLException;

    //未来24小时天气状况
    List<Forcast> getAtmosphere(@Param("longitude") Double longitude,@Param("latitude") Double latitude) throws SQLException;
}

package com.chengyun.chengyun.mapperpg;

import com.chengyun.chengyun.domain.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface GisApiMapper {
    List<Jqjc> getPublicOpinion(@Param("lonMax") String lonMax,
                                @Param("lonMin") String lonMin,
                                @Param("latMax") String latMax,
                                @Param("latMin") String latMin) throws SQLException;

    List<Cldwjgj> getVehicleCoordinates(@Param("type") String type,
                                        @Param("lonMax") String lonMax,
                                        @Param("lonMin") String lonMin,
                                        @Param("latMax") String latMax,
                                        @Param("latMin") String latMin) throws SQLException;

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


}

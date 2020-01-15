package com.chengyun.chengyun.mapperpg;

import com.chengyun.chengyun.domain.Jqjc;
import com.chengyun.chengyun.domain.Whpqyya;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface GisApiMapper {
    List<Jqjc> getPublicOpinion(@Param("lonMax")String lonMax,
                                @Param("lonMin")String lonMin,
                                @Param("latMax")String latMax,
                                @Param("latMin")String latMin)throws SQLException;
}

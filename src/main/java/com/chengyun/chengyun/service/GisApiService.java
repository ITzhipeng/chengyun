package com.chengyun.chengyun.service;

import com.chengyun.chengyun.domain.Jqjc;
import com.chengyun.chengyun.domain.Whpqyya;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

public interface GisApiService {
    //企业基本信息
    List<Jqjc> getPublicOpinion(String lonMax,String lonMin,String latMax,String latMin)throws SQLException;
}

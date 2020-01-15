package com.chengyun.chengyun.mapper;

import com.chengyun.chengyun.domain.QyJcxx;
import com.chengyun.chengyun.domain.WhclJbxx;
import com.chengyun.chengyun.domain.Whpqyya;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface ApiMapper {
    List<WhclJbxx> getVehicle() throws SQLException;
    List<QyJcxx> getEnterprise()throws SQLException;
    List<Whpqyya> getEnterprisePlan()throws SQLException;
}

package com.chengyun.chengyun.domain;

/**
 * 空气质量指数
 * @author Administrator
 * @date 2020/1/15 12:05
 */
public class Kqzlzs {

    private String aqivalue;//	数值
    private String groupid;//	分区编号主键
    private String aqiitemid;//	因子编码主键
    private String grade;//	AQI等级
    private String jhpt_update_time;//	时间戳
    private String aqiitemname;//	因子名称
    private String aqi;//	AQI
    private String lst_aqi;//	数据结束时间主键
    private String lst;//	数据开始时间主键
    private String groupname;//	分区名称
    private String quality;//	AQI等级描述

    public String getAqivalue() {
        return aqivalue;
    }

    public void setAqivalue(String aqivalue) {
        this.aqivalue = aqivalue;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public String getAqiitemid() {
        return aqiitemid;
    }

    public void setAqiitemid(String aqiitemid) {
        this.aqiitemid = aqiitemid;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getJhpt_update_time() {
        return jhpt_update_time;
    }

    public void setJhpt_update_time(String jhpt_update_time) {
        this.jhpt_update_time = jhpt_update_time;
    }

    public String getAqiitemname() {
        return aqiitemname;
    }

    public void setAqiitemname(String aqiitemname) {
        this.aqiitemname = aqiitemname;
    }

    public String getAqi() {
        return aqi;
    }

    public void setAqi(String aqi) {
        this.aqi = aqi;
    }

    public String getLst_aqi() {
        return lst_aqi;
    }

    public void setLst_aqi(String lst_aqi) {
        this.lst_aqi = lst_aqi;
    }

    public String getLst() {
        return lst;
    }

    public void setLst(String lst) {
        this.lst = lst;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
}

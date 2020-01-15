package com.chengyun.chengyun.domain;
/**
 * 企业基本信息
 * @author Administrator
 * @date 2020/1/15 12:05
 */
public class Jqjc {
    private String id;//舆情唯一编号
    private String time;//发生时间
    private String address;//地址
    private String longitude;//经度
    private String latitude;//纬度
    private String detail;//突发事件描述
    private String rksj;

    public Jqjc() {
    }

    public Jqjc(String id, String time, String address, String longitude, String latitude, String detail, String rksj) {
        this.id = id;
        this.time = time;
        this.address = address;
        this.longitude = longitude;
        this.latitude = latitude;
        this.detail = detail;
        this.rksj = rksj;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }


    @Override
    public String toString() {
        return "Jqjc{" +
                "id='" + id + '\'' +
                ", time='" + time + '\'' +
                ", address='" + address + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", detail='" + detail + '\'' +
                ", rksj='" + rksj + '\'' +
                '}';
    }
}

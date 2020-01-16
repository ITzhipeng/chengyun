package com.chengyun.chengyun.domain;

/**
 * 车辆定位及轨迹信息
 * @author Administrator
 * @date 2020/1/15 12:05
 */
public class Cldwjgj {
    private String id;//id	坐标编号
    private String longitude;//经度
    private String latitude;//纬度
    private String time;//时间


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

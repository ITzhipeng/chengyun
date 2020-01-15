package com.chengyun.chengyun.domain;

/**
 * 社会应急救援队
 *
 * @author Administrator
 * @date 2020/1/15 12:05
 */
public class Shyjjy {
    private String id;//id	应急救援队唯一编号
    private String name;//救援队名称
    private String address;//地址
    private String longitude;//经度
    private String latitude;//纬度
    private String phone;//电话
    private String organization;//所属单位/部门

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }
}

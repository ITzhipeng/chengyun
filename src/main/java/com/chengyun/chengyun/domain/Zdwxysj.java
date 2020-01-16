package com.chengyun.chengyun.domain;

/**
 * 重大危险源数据
 * @author Administrator
 * @date 2020/1/15 12:05
 */
public class Zdwxysj {
    private String id;//	危险源唯一编号
    private String code;//	重大危险源标识
    private String address;//	地址
    private String type;//	类型
    private String level;//	等级
    private String majorJob;//	防范重点
    private String specialist;//	场所特点
    private String responsibility;//	责任主体

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getMajorJob() {
        return majorJob;
    }

    public void setMajorJob(String majorJob) {
        this.majorJob = majorJob;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public String getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }
}

package com.chengyun.chengyun.domain;

/**
 * 气象十天预报
 * @author Administrator
 * @date 2020/1/15 12:05
 */
public class Qxstyb {

    private String ybrq;//	预报日期
    private String bttqqk;//	白天天气情况
    private String ywtqqk;//	夜晚天气情况
    private String zdqw;//	最低气温
    private String zgqw;//	最高气温
    private String fx;//	风向
    private String fl;//	风力（级）
    private String jsgl;//	降水概率（%）ybrq	预报日期

    public String getYbrq() {
        return ybrq;
    }

    public void setYbrq(String ybrq) {
        this.ybrq = ybrq;
    }

    public String getBttqqk() {
        return bttqqk;
    }

    public void setBttqqk(String bttqqk) {
        this.bttqqk = bttqqk;
    }

    public String getYwtqqk() {
        return ywtqqk;
    }

    public void setYwtqqk(String ywtqqk) {
        this.ywtqqk = ywtqqk;
    }

    public String getZdqw() {
        return zdqw;
    }

    public void setZdqw(String zdqw) {
        this.zdqw = zdqw;
    }

    public String getZgqw() {
        return zgqw;
    }

    public void setZgqw(String zgqw) {
        this.zgqw = zgqw;
    }

    public String getFx() {
        return fx;
    }

    public void setFx(String fx) {
        this.fx = fx;
    }

    public String getFl() {
        return fl;
    }

    public void setFl(String fl) {
        this.fl = fl;
    }

    public String getJsgl() {
        return jsgl;
    }

    public void setJsgl(String jsgl) {
        this.jsgl = jsgl;
    }
}

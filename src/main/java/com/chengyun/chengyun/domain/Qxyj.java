package com.chengyun.chengyun.domain;

/**
 * 气象预警
 * @author Administrator
 * @date 2020/1/15 12:05
 */
public class Qxyj {
    private String qm;//	区名
    private String fbsj;//	发布时间
    private String yjlx;//	预警类型
    private String yjjb;//	预警级别
    private String yjzt;//	预警状态
    private String yjxhnr;//	预警信号内容

    public String getQm() {
        return qm;
    }

    public void setQm(String qm) {
        this.qm = qm;
    }

    public String getFbsj() {
        return fbsj;
    }

    public void setFbsj(String fbsj) {
        this.fbsj = fbsj;
    }

    public String getYjlx() {
        return yjlx;
    }

    public void setYjlx(String yjlx) {
        this.yjlx = yjlx;
    }

    public String getYjjb() {
        return yjjb;
    }

    public void setYjjb(String yjjb) {
        this.yjjb = yjjb;
    }

    public String getYjzt() {
        return yjzt;
    }

    public void setYjzt(String yjzt) {
        this.yjzt = yjzt;
    }

    public String getYjxhnr() {
        return yjxhnr;
    }

    public void setYjxhnr(String yjxhnr) {
        this.yjxhnr = yjxhnr;
    }
}

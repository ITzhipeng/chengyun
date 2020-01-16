package com.chengyun.chengyun.domain;

/**
 * 网络舆情热点
 * @author Administrator
 * @date 2020/1/15 12:05
 */
public class Wlyqrd {
    private String id_yq;//	舆情信息库内部标识序号
    private String jhpt_update_time;//	数据更新时间
    private String rank_yq;//	舆情信息Top10编号
    private String title_yq;//	舆情信息标题
    private String time_yq;//	舆情信息时间
    private String heat_yq;//	舆情信息热力指数
    private String vol_24h_yq;//	舆情信息24小时数据量

    public String getId_yq() {
        return id_yq;
    }

    public void setId_yq(String id_yq) {
        this.id_yq = id_yq;
    }

    public String getJhpt_update_time() {
        return jhpt_update_time;
    }

    public void setJhpt_update_time(String jhpt_update_time) {
        this.jhpt_update_time = jhpt_update_time;
    }

    public String getRank_yq() {
        return rank_yq;
    }

    public void setRank_yq(String rank_yq) {
        this.rank_yq = rank_yq;
    }

    public String getTitle_yq() {
        return title_yq;
    }

    public void setTitle_yq(String title_yq) {
        this.title_yq = title_yq;
    }

    public String getTime_yq() {
        return time_yq;
    }

    public void setTime_yq(String time_yq) {
        this.time_yq = time_yq;
    }

    public String getHeat_yq() {
        return heat_yq;
    }

    public void setHeat_yq(String heat_yq) {
        this.heat_yq = heat_yq;
    }

    public String getVol_24h_yq() {
        return vol_24h_yq;
    }

    public void setVol_24h_yq(String vol_24h_yq) {
        this.vol_24h_yq = vol_24h_yq;
    }
}

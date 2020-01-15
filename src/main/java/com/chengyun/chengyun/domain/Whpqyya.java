package com.chengyun.chengyun.domain;

/**
 * 危化品企源
 * @author Administrator
 * @date 2020/1/15 12:05
 */
public class Whpqyya {
    private String id;//id	预案唯一编号
    private String entName;//entName	企业名称
    private String planSummary;//planSummary	预案与企业关联关系
    private String planDetail;//planDetail	预案内容
    private String planCategory;//planCategory	预案类别
    private String contact;//contact	联系人
    private String phone;//phone 联系电话
    private String rksj;

    public Whpqyya(String id, String entName, String planSummary, String planDetail, String planCategory, String contact, String phone, String rksj) {
        this.id = id;
        this.entName = entName;
        this.planSummary = planSummary;
        this.planDetail = planDetail;
        this.planCategory = planCategory;
        this.contact = contact;
        this.phone = phone;
        this.rksj = rksj;
    }

    public Whpqyya() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEntName() {
        return entName;
    }

    public void setEntName(String entName) {
        this.entName = entName;
    }

    public String getPlanSummary() {
        return planSummary;
    }

    public void setPlanSummary(String planSummary) {
        this.planSummary = planSummary;
    }

    public String getPlanDetail() {
        return planDetail;
    }

    public void setPlanDetail(String planDetail) {
        this.planDetail = planDetail;
    }

    public String getPlanCategory() {
        return planCategory;
    }

    public void setPlanCategory(String planCategory) {
        this.planCategory = planCategory;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRksj() {
        return rksj;
    }

    public void setRksj(String rksj) {
        this.rksj = rksj;
    }

    @Override
    public String toString() {
        return "Whpqyya{" +
                "id='" + id + '\'' +
                ", entName='" + entName + '\'' +
                ", planSummary='" + planSummary + '\'' +
                ", planDetail='" + planDetail + '\'' +
                ", planCategory='" + planCategory + '\'' +
                ", contact='" + contact + '\'' +
                ", phone='" + phone + '\'' +
                ", rksj='" + rksj + '\'' +
                '}';
    }
}

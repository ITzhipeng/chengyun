package com.chengyun.chengyun.domain;
/**
 * 企业基本信息
 * @author Administrator
 * @date 2020/1/15 12:05
 */
public class QyJcxx {
    private String id;//企业唯一标识
    private String entName;//企业名称
    private String entCatogory;//企业分类
    private String entCode;//机构代码
    private String licenseNumber;//生产许可证号
    private String expDate;//许可证有效期
    private String registerAddress;//注册地
    private String productionSite;//生产场所
    private String legalRepresentative;//法定代表人
    private String district;//所属行政区
    private String street;//隶属街道
    private String businessScope;//危化品许可范围
    private String rksj;

    public QyJcxx(String id, String entName, String entCatogory, String entCode, String licenseNumber, String expDate, String registerAddress, String productionSite, String legalRepresentative, String district, String street, String businessScope, String rksj) {
        this.id = id;
        this.entName = entName;
        this.entCatogory = entCatogory;
        this.entCode = entCode;
        this.licenseNumber = licenseNumber;
        this.expDate = expDate;
        this.registerAddress = registerAddress;
        this.productionSite = productionSite;
        this.legalRepresentative = legalRepresentative;
        this.district = district;
        this.street = street;
        this.businessScope = businessScope;
        this.rksj = rksj;
    }

    public QyJcxx() {
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

    public String getEntCatogory() {
        return entCatogory;
    }

    public void setEntCatogory(String entCatogory) {
        this.entCatogory = entCatogory;
    }

    public String getEntCode() {
        return entCode;
    }

    public void setEntCode(String entCode) {
        this.entCode = entCode;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
    }

    public String getProductionSite() {
        return productionSite;
    }

    public void setProductionSite(String productionSite) {
        this.productionSite = productionSite;
    }

    public String getLegalRepresentative() {
        return legalRepresentative;
    }

    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
    }

    public String getRksj() {
        return rksj;
    }

    public void setRksj(String rksj) {
        this.rksj = rksj;
    }

    @Override
    public String toString() {
        return "QyJcxx{" +
                "id='" + id + '\'' +
                ", entName='" + entName + '\'' +
                ", entCatogory='" + entCatogory + '\'' +
                ", entCode='" + entCode + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", expDate='" + expDate + '\'' +
                ", registerAddress='" + registerAddress + '\'' +
                ", productionSite='" + productionSite + '\'' +
                ", legalRepresentative='" + legalRepresentative + '\'' +
                ", district='" + district + '\'' +
                ", street='" + street + '\'' +
                ", businessScope='" + businessScope + '\'' +
                ", rksj='" + rksj + '\'' +
                '}';
    }
}

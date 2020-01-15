package com.chengyun.chengyun.domain;
/**
 * 危化车辆基本信息
 * @author Administrator
 * @date 2020/1/15 12:05
 */

public class WhclJbxx {
    private String id;//id	车辆唯一标识
    private String plateNumber;//plateNumber	车牌号
    private String cargoType;//cargoType	货物类型
    private String driverName;//driverName	驾驶员
    private String supercargoName;//supercargoName	押运员
    private String shipperAddress;//shipperAddress	发货地址
    private String deliverAddress;//deliverAddress	收货地址
    private String vehicleType;//vehicleType	车型
    private String ratedTonnage;//ratedTonnage	额定吨位
    private String ownedName;//ownedName	业户名
    private String businessScope;//businessScope	经营范围
    private String businessLicense;//businessLicense	企业经营许可证

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getSupercargoName() {
        return supercargoName;
    }

    public void setSupercargoName(String supercargoName) {
        this.supercargoName = supercargoName;
    }

    public String getShipperAddress() {
        return shipperAddress;
    }

    public void setShipperAddress(String shipperAddress) {
        this.shipperAddress = shipperAddress;
    }

    public String getDeliverAddress() {
        return deliverAddress;
    }

    public void setDeliverAddress(String deliverAddress) {
        this.deliverAddress = deliverAddress;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getRatedTonnage() {
        return ratedTonnage;
    }

    public void setRatedTonnage(String ratedTonnage) {
        this.ratedTonnage = ratedTonnage;
    }

    public String getOwnedName() {
        return ownedName;
    }

    public void setOwnedName(String ownedName) {
        this.ownedName = ownedName;
    }

    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }


}

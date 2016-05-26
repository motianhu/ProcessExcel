package com.smona.base.excel.newlib;

public class CarDatas {
    private int carBrandId;
    private String carBrandName;
    private int carSetId;
    private String carSetName;
    private int carTypeId;
    private String carTypeName;

    public int getCarBrandId() {
        return carBrandId;
    }

    public void setCarBrandId(int carBrandId) {
        this.carBrandId = carBrandId;
    }

    public String getCarBrandName() {
        return carBrandName;
    }

    public void setCarBrandName(String carBrandName) {
        this.carBrandName = carBrandName;
    }

    public int getCarSetId() {
        return carSetId;
    }

    public void setCarSetId(int carSetId) {
        this.carSetId = carSetId;
    }

    public String getCarSetName() {
        return carSetName;
    }

    public void setCarSetName(String carSetName) {
        this.carSetName = carSetName;
    }

    public int getCarTypeId() {
        return carTypeId;
    }

    public void setCarTypeId(int carTypeId) {
        this.carTypeId = carTypeId;
    }

    public String getCarTypeName() {
        return carTypeName;
    }

    public void setCarTypeName(String carTypeName) {
        this.carTypeName = carTypeName;
    }

    public String toString() {
        return "carBrandId=" + carBrandId + ", carBrandName=" + carBrandName
                + ", carSetId=" + carSetId + ", carSetName=" + carSetName
                + " carTypeId" + carTypeId + ", carTypeName=" + carTypeName;
    }
}

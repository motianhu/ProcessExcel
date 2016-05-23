package com.smona.base.excel.newlib;

public class CarType {
    private int id;
    private String carTypeName;
    private int carBrandId;
    private int carSetId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarTypeName() {
        return carTypeName;
    }

    public void setCarTypeName(String carTypeName) {
        this.carTypeName = carTypeName;
    }

    public int getCarBrandId() {
        return carBrandId;
    }

    public void setCarBrandId(int carBrandId) {
        this.carBrandId = carBrandId;
    }

    public int getCarSetId() {
        return carSetId;
    }

    public void setCarSetId(int carSetId) {
        this.carSetId = carSetId;
    }
}

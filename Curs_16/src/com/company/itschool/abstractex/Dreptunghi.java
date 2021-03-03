package com.company.itschool.abstractex;

public class Dreptunghi extends FormaGeometrica{

    private double lat;
    private double lun;


    @Override
    public double calculateArea() {
        return lat * lun;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * lat + 2 * lun;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLun() {
        return lun;
    }

    public void setLun(double lun) {
        this.lun = lun;
    }
}

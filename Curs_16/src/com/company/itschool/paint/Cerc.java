package com.company.itschool.paint;

public class Cerc extends FormaGeometrica{

    private double raza;

    public double getRaza() {
        return raza;
    }

    public void setRaza(double raza) {
        this.raza = raza;
    }

    @Override
    public void deseneaza() {
        System.out.println("Punct de desenare ");
        System.out.println(super.getStartPointX() + " " + super.getStartPointY());
        System.out.println("Raza de: " + raza);
    }
}

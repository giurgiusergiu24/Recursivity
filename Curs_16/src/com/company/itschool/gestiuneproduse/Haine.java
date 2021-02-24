package com.company.itschool.gestiuneproduse;

public class Haine extends Produs {

    private String marime;

    public Haine(String name, double pret, String producator) {
        super(name, pret, producator);
    }

    public String getMarime() {
        return marime;
    }

    public void setMarime(String marime) {
        this.marime = marime;
    }
}

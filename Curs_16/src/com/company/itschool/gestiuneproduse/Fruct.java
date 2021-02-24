package com.company.itschool.gestiuneproduse;

public class Fruct extends Produs{

    private boolean bio = false;

    public Fruct(String name, double pret, String producator) {
        super(name, pret, producator);
    }

    public boolean isBio() {
        return bio;
    }

    public void setBio(boolean bio) {
        this.bio = bio;
    }
}

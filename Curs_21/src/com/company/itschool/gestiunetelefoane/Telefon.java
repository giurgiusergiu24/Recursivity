package com.company.itschool.gestiunetelefoane;

public class Telefon {

    private String nume;
    private Contact[] contacte = new Contact[10];
    private int index = 0;

    public Telefon(String nume) {
        this.nume = nume;
    }

    public  void addContact (Contact contact){
        this.contacte [index] = contact;
        this.index++;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setContacte(Contact[] contacte) {
        this.contacte = contacte;
    }

    public String getNume() {
        return nume;
    }

    public Contact[] getContacte() {
        return contacte;
    }
}

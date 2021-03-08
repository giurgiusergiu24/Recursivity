package com.company.itschool.gestiunetelefoane;

public class Contact {

    private String nume;
    private String prenume;
    private String nrTelefon;

    public Contact(String nume, String prenume, String nrTelefon) {
        this.nume = nume;
        this.prenume = prenume;
        this.nrTelefon = nrTelefon;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }
}

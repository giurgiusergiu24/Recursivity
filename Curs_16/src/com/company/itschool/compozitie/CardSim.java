package com.company.itschool.compozitie;

public class CardSim {

    private String operator;
    private String numeFrecventa;

    public  CardSim(int frecventa, String operator){
        this.operator = operator;
        this.numeFrecventa =frecventa + "G";

    }

    public void setFrecventa (int frecventa){
        this.numeFrecventa = frecventa + "G";
    }

    public String getFrecventa (){
        return this.numeFrecventa;
    }
}

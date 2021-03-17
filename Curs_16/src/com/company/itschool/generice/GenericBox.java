package com.company.itschool.generice;

public class GenericBox <TYPE, KEY> {


    private TYPE data;
    private KEY keyData;

    public void add(TYPE dataToBeAdded){
        this.data = dataToBeAdded;

    }

    public TYPE getData() {
        return data;
    }

    public void setData(TYPE data) {
        this.data = data;
    }

    public KEY getKeyData(String gabi) {
        return keyData;
    }

    public void setKeyData(KEY keyData) {
        this.keyData = keyData;
    }
}

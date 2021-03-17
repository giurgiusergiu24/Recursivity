package com.company.itschool.generice;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        String gabi = "Gabi";
        lista.add(gabi);

        Collection list = new ArrayList<>();

        GenericBox<String, String> cutie = new GenericBox<>();
        GenericBox<Integer, String> cutieInteger = new GenericBox<>();

        cutie.add("Gabi");
        cutieInteger.add(2);
        cutieInteger.getKeyData("Gabi");


        int x = cutieInteger.getData();
        String nume = cutie.getData();

        GenericBox nespecificatBox = new GenericBox();
        nespecificatBox.add("Gabi");

    }
}

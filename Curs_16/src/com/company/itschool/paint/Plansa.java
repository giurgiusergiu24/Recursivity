package com.company.itschool.paint;

import java.sql.Array;
import java.util.ArrayList;

public class Plansa implements Desenabil {

    private int width;
    private int height;

    private ArrayList<FormaGeometrica> formeGerometrice = new ArrayList<>();

    public void add(FormaGeometrica formaGeometrica) {
        formeGerometrice.add(formaGeometrica);

    }

    @Override
    public void deseneaza() {
        for (int i = 0; i < formeGerometrice.size(); i++) {
            FormaGeometrica formaGeometrica = formeGerometrice.get(i);
            formaGeometrica.deseneaza();
        }
    }
}

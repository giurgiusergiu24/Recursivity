package com.company.itschool.depozit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Colet colet1 = new Colet("strada parcului");
        Colet colet2 = new Colet("strada anghelescu");
        Colet colet3 = new Colet("strada iordanescu");
        Colet colet4 = new Colet("strada vladimirescu");

        Map<String, ArrayList<Colet>> depositul = new HashMap<>();
        ArrayList<Colet> coleteDin1A = new ArrayList<>();
        coleteDin1A.add(colet1);
        coleteDin1A.add(colet2);
        depositul.put("1A", coleteDin1A);

        ArrayList<Colet> coleteDin1B = new ArrayList<>();
        coleteDin1B.add(colet3);
        coleteDin1B.add(colet4);

        depositul.put("1B", coleteDin1B);

        ArrayList<Colet> coleteDeLa1B = depositul.get("1B");
        for (Colet colet : coleteDeLa1B) {
            System.out.println(colet.getAdresa());

        }


    }
}

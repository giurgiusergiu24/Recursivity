package com.company.itschool.gestiuneproduse;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int optiune = -1;

        Produs[] produses = new Produs[100];
        int index = 0;
        while (optiune != 0) {
            System.out.println("1. Adauga Fructe");
            System.out.println("2. Adauga Dulciuri");
            System.out.println("3. Adauga Haine");
            System.out.println("4. Afiseaza produsele disponibile");
            System.out.println("0. Exit");
            System.out.println("Introduceti o optiune: ");
            optiune = scanner.nextInt();
            scanner.nextLine();

            if (optiune == 1 || optiune == 2 || optiune == 3) {
                System.out.println("Introdu numele produsului");
                String name = scanner.nextLine();
                System.out.println("Introdu pretul produsului");
                double pret = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Introduceti producatorul: ");
                String producatorul = scanner.nextLine();

                if (optiune == 1) {
                    System.out.println("Este fructul bio? (y/n)");
                    String esteBio = scanner.nextLine();
                    boolean isBio = false;
                    if (esteBio.equals("y")) {
                        isBio = true;
                    }
                    Fruct fruct = new Fruct(name, pret, producatorul);
                    fruct.setBio(isBio);
                    produses[index] = fruct;
                    index++;
                }
                if (optiune == 2) {
                    System.out.println("Introduceti gramajul");
                    int gramaj = scanner.nextInt();
                    scanner.nextLine();
                    Dulciuri dulciuri = new Dulciuri(name, pret, producatorul);
                    dulciuri.setGramaj(gramaj);
                    produses[index] = dulciuri;
                    index++;
                }
                if (optiune == 3) {
                    System.out.println("Introduceti marimea");
                    String marime = scanner.nextLine();
                    Haine haine = new Haine(name, pret, producatorul);
                    haine.setMarime(marime);
                    produses[index] = haine;
                    index++;

                }

            }
            if (optiune == 4) {
                 afisareProduse(produses);
            }
        }
    }
    public static void afisareProduse(Produs[] produses){

        for(int i = 0; i < produses.length; i++){
            Produs produs = produses[i];
            if(produs != null){
                String name = produs.getName();
                double pret = produs.getPret();
                String producatorul = produs.getProducator();
                System.out.println(name + " pret: " + pret + " lei: " + " producatorul: " + producatorul);


            }
        }
    }
}
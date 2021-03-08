package com.company.itschool.personalfacultate;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ionescu", "Gabriel", 27, 1);
        student.schimbaNume("Popescu");

        Profesor profesor = new Profesor("Popescu", "Ion", 30, "Engleza");

        Persoana persoana = new Persoana("Alex", "Vlad", 20);

        afisarePersoana(persoana);
        afisarePersoana(student);
        afisarePersoana(profesor);

        //Polymorfism

        Persoana[] persoane = new Persoana[5];
        persoane[0] = persoana;
        persoane[1] = profesor;
        persoane[2] = student;


        for (int i = 0; i < persoane.length; i++) {
            Persoana per = persoane[i];
            if (per != null) {
                afisarePersoana(per);
            }
        }
    }

    //polymorfism
    // o alta forma a clasei Persoane si anume forma de student/profesor
    public static void afisarePersoana(Persoana persoana) {
        String nume = persoana.getNume();
        String prenume = persoana.getPrenume();
        System.out.println(nume + " " + prenume);
    }
}

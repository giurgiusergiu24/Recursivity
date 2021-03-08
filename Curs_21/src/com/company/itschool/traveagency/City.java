package com.company.itschool.traveagency;

import java.util.ArrayList;

public class City {
    private String name;

    private String descriere;


    private ArrayList<Airport> airports = new ArrayList<Airport>();

    public ArrayList<Airport> getAirports() {
        return airports;
    }

    private ArrayList<Hotel> hotels = new ArrayList<>();


    public ArrayList<Hotel> getHotels() {
        return hotels;
    }


    public void setHotels(ArrayList<Hotel> hotels) {
        this.hotels = hotels;
    }

    public void setAirports(ArrayList<Airport> airports) {
        this.airports = airports;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public void display() {
        System.out.println(name);
        System.out.println("Airports: ");
        for (int i = 0; i < airports.size(); i++) {
            Airport airport = airports.get(i);
            airport.display();
        }
        System.out.println("Hotels: ");
        for (int i = 0; i < hotels.size(); i++){
            Hotel hotel = hotels.get(i);
            hotel.display();
        }

    }
}

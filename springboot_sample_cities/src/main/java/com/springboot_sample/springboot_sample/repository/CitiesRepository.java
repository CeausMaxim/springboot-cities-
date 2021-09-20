package com.springboot_sample.springboot_sample.repository;

import java.util.ArrayList;

public class CitiesRepository {
    ArrayList<String> cities = new ArrayList<>();

    public CitiesRepository(){
        this.cities.add("Glodeni");
        this.cities.add("Balti");
        this.cities.add("Riscani");
        this.cities.add("Floresti");
    }

    public String create(String citiesName){
        this.cities.add(citiesName);
        return "Cities created";
    }
}
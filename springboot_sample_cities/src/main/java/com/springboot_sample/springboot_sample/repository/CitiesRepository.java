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

    public String read(Integer id){
        try {
            return id + ":" + this.cities.get(id);
        } catch (Exception exception){
            return "Not found";
        }
    }

    public String readAll(){
        return this.cities.toString();
    }

    public String update(Integer id, String citiesName){
        try {
            this.cities.set(id, citiesName);
            return "Country updated";
        } catch (Exception exception){
            return "Country not found";
        }
    }
}

package com.springboot_sample.springboot_sample.controller;

import com.springboot_sample.springboot_sample.repository.CitiesRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class CitiesController {
    CitiesRepository citiesRepository = new CitiesRepository();

    @PostMapping("cities")
    public String create(@RequestParam String citiesName){
        return citiesRepository.create(citiesName);
    }


}

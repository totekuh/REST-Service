package com.example.cities.demo.web;

import com.example.cities.demo.model.City;
import com.example.cities.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class CitiesController {
    private final CityService service;

    @Autowired
    public CitiesController(CityService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String index() {
        return "Hello World";
    }

    @GetMapping("/cities")
    public List<City> cities(@RequestParam(name = "entry", defaultValue = "") String entry) {
        if (entry != null && entry.length() > 2)
            return service.getCitiesByEntry(entry);
        else
            return Collections.emptyList();
    }

    @GetMapping("/citiesAuth")
    //protected by SecurityConfig
    public List<City> citiesAuth(@RequestParam(name = "entry", defaultValue = "") String entry) {
        return cities(entry);
    }
}

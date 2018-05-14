package com.example.cities.demo.web;

import com.example.cities.demo.model.City;
import com.example.cities.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class CitiesController {
    private final CityService service;

    @Autowired
    public CitiesController(CityService service) {
        this.service = service;
    }

    @GetMapping("/cities")
    public List<City> index(@RequestParam(name = "entry", defaultValue = "") String entry) {
        if (entry != null && entry.length() > 2)
            return service.getCitiesByEntry(entry);
        else
            return Collections.emptyList();
    }
}

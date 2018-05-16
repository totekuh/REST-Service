package com.example.cities.demo.web;

import com.example.cities.demo.model.City;
import com.example.cities.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;

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
    public List<City> cities(@RequestParam(name = "entry", defaultValue = "") String entry) {
        if (entry != null && entry.length() > 2)
            return service.getCitiesByEntry(entry);
        else
            return Collections.emptyList();
    }

    @GetMapping("/citiesAuth")
    public List<City> citiesAuth(@RequestParam(name = "entry", defaultValue = "") String entry) {
        List<City> cities = service.getCitiesByEntryAuth(entry);
        return cities;
    }
}

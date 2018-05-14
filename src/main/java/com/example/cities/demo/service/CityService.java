package com.example.cities.demo.service;

import com.example.cities.demo.model.City;

import java.util.List;

public interface CityService {
    List<City> getCitiesByEntry(String entry);

    List<City> getCitiesByEntryAuth(String entry);
}

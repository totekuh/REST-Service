package com.example.cities.demo.repository;

import com.example.cities.demo.model.City;

import java.util.List;

public interface CityRepository {

    List<City> getCitiesByEntry(String entry);
}

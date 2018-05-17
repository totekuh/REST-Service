package com.example.cities.demo.service;

import com.example.cities.demo.model.City;
import com.example.cities.demo.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService{
    private final CityRepository cityRepository;

    @Autowired
    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public List<City> getCitiesByEntry(String entry) {
        List<City> cities = cityRepository.getCitiesByEntry(entry);
        if (cities.size() >= 10)
            return cities.subList(0, 10);
        else
            return cities;
    }
}

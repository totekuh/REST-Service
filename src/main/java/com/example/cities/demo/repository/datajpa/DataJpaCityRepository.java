package com.example.cities.demo.repository.datajpa;

import com.example.cities.demo.model.City;
import com.example.cities.demo.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataJpaCityRepository implements CityRepository {
    private final JpaCityRepository jpaCityRepository;

    @Autowired
    public DataJpaCityRepository(JpaCityRepository cityRepository) {
        jpaCityRepository = cityRepository;
    }

    @Override
    public List<City> getCitiesByEntry(String entry) {
        return jpaCityRepository.findByCityNameStartsWith(entry);
    }

}

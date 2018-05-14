package com.example.cities.demo.repository.datajpa;

import com.example.cities.demo.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface JpaCityRepository extends JpaRepository<City, Integer> {

    List<City> findByCityNameStartsWith(String entry);
}
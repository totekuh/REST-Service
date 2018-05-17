package com.example.cities.demo.repository.datajpa;

import com.example.cities.demo.model.City;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataJpaCityRepositoryTest {
    private static final City CITY = new City();

    @Autowired
    private DataJpaCityRepository jpaCityRepository;

    @Before
    public void setUp() throws Exception {
        CITY.setId(1);
        CITY.setCityName("Абаза");
    }

    @Test
    public void testGetCitiesByEntry() {
        City city = jpaCityRepository.getCitiesByEntry("Абаза").stream().findFirst().orElse(null);
        Assert.assertEquals(CITY, city);
    }

    @Test
    public void testGetCitiesByEntryNull() {
        City city = jpaCityRepository.getCitiesByEntry("Magadan").stream().findFirst().orElse(null);
        Assert.assertNull(city);
    }

}
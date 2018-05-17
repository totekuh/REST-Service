package com.example.cities.demo.service;

import com.example.cities.demo.model.City;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class CityServiceImplTest {

    private static final City CITY = new City();

    @Autowired
    private CityService service;

    @BeforeClass
    public static void setUp() {
        CITY.setCityName("Абаза");
        CITY.setId(1);
    }

    @Test
    public void testGetCitiesByEntry() {
        City city = service.getCitiesByEntry("Абаза").stream().findFirst().orElse(null);
        Assert.assertEquals(CITY, city);
    }

    @Test
    public void testGetCitiesByEntryNull() {
        City city = service.getCitiesByEntry("Абазазаза").stream().findFirst().orElse(null);
        Assert.assertNull(city);
    }
}
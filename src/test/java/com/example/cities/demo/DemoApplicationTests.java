package com.example.cities.demo;

import com.example.cities.demo.model.City;
import com.example.cities.demo.repository.CityRepository;
import com.example.cities.demo.repository.datajpa.DataJpaCityRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Sql(scripts = "classpath:data.sql", config = @SqlConfig(encoding = "UTF-8"))
public class DemoApplicationTests {

	@Autowired
	private DataJpaCityRepository repository;


	@Test
	public void contextLoads() {
		List<City> cities = repository.getAll();
		System.out.println(cities);
		List<City> filtered = repository.getCitiesByEntry("Аба");
		System.out.println(filtered);
	}

}

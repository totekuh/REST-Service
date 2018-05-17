package com.example.cities.demo;

import com.example.cities.demo.model.City;
import com.example.cities.demo.repository.CityRepository;
import com.example.cities.demo.repository.datajpa.DataJpaCityRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Sql(scripts = "classpath:data.sql", config = @SqlConfig(encoding = "UTF-8"))
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		ConfigurableApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
	}

}

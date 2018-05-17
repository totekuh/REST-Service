package com.example.cities.demo.web;

import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class CitiesControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void cities() throws JSONException {
        String body = this.restTemplate.getForObject("/cities?entry=Абаза", String.class);
        assertThat(body).isEqualTo("[{\"id\":1,\"cityName\":\"Абаза\"}]");
    }

    @Test

    public void citiesAuth() {
        this.restTemplate.getForObject("/citiesAuth?entry=Абаза", String.class);
    }

}
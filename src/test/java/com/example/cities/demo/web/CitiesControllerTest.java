package com.example.cities.demo.web;

import com.example.cities.demo.config.SecurityConfig;
import com.example.cities.demo.service.CityService;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithAnonymousUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(CitiesController.class)
@Import(SecurityConfig.class)
public class CitiesControllerTest {


    @Autowired
    private MockMvc mvc;

    @MockBean
    private CityService cityService;


    @Test
    @WithAnonymousUser
    public void cities() throws Exception {
        this.mvc
                .perform(get("/cities?entry=Абаза"))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk());
    }

    @Test
    public void citiesAuth() throws Exception {
        this.mvc
                .perform(get("/citiesAuth?entry=Абаза"))
                .andExpect(redirectedUrl("http://localhost/login"));
    }
}
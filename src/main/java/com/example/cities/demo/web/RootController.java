package com.example.cities.demo.web;

import com.example.cities.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class RootController {
    private final UserService userService;

    @Autowired
    public RootController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String index() {
        return "Hello World";
    }

//    @RequestMapping("/login")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void login(HttpServletResponse response) {
//
//    }

}

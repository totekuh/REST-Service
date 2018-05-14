package com.example.cities.demo.service;

import com.example.cities.demo.auth.AuthorizedUser;

public interface UserService {
    boolean login(String login, String password);
}

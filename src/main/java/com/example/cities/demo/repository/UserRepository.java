package com.example.cities.demo.repository;

import com.example.cities.demo.model.User;

public interface UserRepository {

    User login(String login, String password);
}

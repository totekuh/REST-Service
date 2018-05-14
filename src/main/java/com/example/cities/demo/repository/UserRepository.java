package com.example.cities.demo.repository;

import com.example.cities.demo.model.User;

public interface UserRepository {

    User save(User user);

    User get(int id);

    boolean delete(int id);

    User getByUserName(String userName);
}

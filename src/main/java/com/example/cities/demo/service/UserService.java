package com.example.cities.demo.service;

import com.example.cities.demo.model.User;

public interface UserService {
    User create(User user);

    User update(User user);

    void delete(int id);

    User get(int id);

    User getByUserName(String userName);
}

package com.example.cities.demo.service;

import com.example.cities.demo.auth.AuthorizedUser;
import com.example.cities.demo.model.User;
import com.example.cities.demo.auth.GeneratedToken;
import com.example.cities.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public boolean login(String login, String password) {
        User user = userRepository.login(login, password);
        if (user != null) {
            AuthorizedUser.authorize(user.getId(), GeneratedToken.getToken());
            return true;
        }
        else
            return false;
    }
}

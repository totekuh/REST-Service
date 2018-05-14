package com.example.cities.demo.repository.datajpa;

import com.example.cities.demo.model.User;
import com.example.cities.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class DataJpaUserRepository implements UserRepository {
    private final JpaUserRepository jpaUserRepository;

    @Autowired
    public DataJpaUserRepository(JpaUserRepository userRepository) {
        jpaUserRepository = userRepository;
    }

    @Override
    public User save(User user) {
        return jpaUserRepository.save(user);
    }

    @Override
    public User get(int id) {
        return jpaUserRepository.findById(id).orElse(null);
    }

    @Override
    public boolean delete(int id) {
        return jpaUserRepository.delete(id) != 0;
    }

    @Override
    public User getByUserName(String userName) {
        return jpaUserRepository.findByUserName(userName).orElse(null);
    }
}

package com.example.cities.demo.repository.datajpa;

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

}

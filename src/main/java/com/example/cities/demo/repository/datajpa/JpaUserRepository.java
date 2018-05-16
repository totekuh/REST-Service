package com.example.cities.demo.repository.datajpa;

import com.example.cities.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserRepository extends JpaRepository<User, Integer> {

}

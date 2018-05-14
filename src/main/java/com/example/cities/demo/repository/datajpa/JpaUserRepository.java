package com.example.cities.demo.repository.datajpa;

import com.example.cities.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface JpaUserRepository extends JpaRepository<User, Integer> {

    @Query("SELECT u FROM User u WHERE u.userName =:login AND u.password =:password")
    User login(@Param("login") String login,@Param("password") String password);
}

package com.example.cities.demo.auth;

public class AuthorizedUser {
    private static Integer id;
    private static String token;


    public static Integer id() {
        return id;
    }

    public static String getToken() {
        return token;
    }

    public static void authorize(Integer userId, String generatedToken) {
        id = userId;
        token = generatedToken;
    }

}

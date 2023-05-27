package com.example.CleanArchitecture.entities;

public class User {
    public String username;
    public String name;
    public String lastname;
    public String email;
    public int levelAccess;

    @Override
    public String toString() {
        return "User{" +
                "userName='" + username + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", levelAccess=" + levelAccess +
                '}';
    }
}

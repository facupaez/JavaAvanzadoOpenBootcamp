package com.company.L.good;

public class User {
    public String userName;
    public String name;
    public String lastName;
    public String email;
    public int levelAccess;

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", levelAccess=" + levelAccess +
                '}';
    }
}
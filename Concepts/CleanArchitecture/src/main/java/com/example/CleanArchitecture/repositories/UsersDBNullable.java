package com.example.CleanArchitecture.repositories;

import com.example.CleanArchitecture.entities.User;

import java.util.ArrayList;

public class UsersDBNullable extends UsersDB {

    @Override
    public ArrayList<User> listUsers() {
        return null;
    }

    @Override
    public User getUser(User user) {
        return null;
    }

    @Override
    public void addUser(User user) {
    }

    @Override
    public void deleteUser(User user) {
    }

}

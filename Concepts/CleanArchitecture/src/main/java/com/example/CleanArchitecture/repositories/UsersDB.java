package com.example.CleanArchitecture.repositories;

import com.example.CleanArchitecture.entities.User;

import java.util.ArrayList;

abstract public class UsersDB {
    private int totalInsertions = 0;
    private int totalDeletes = 0;

    abstract public ArrayList<User> listUsers();

    abstract public User getUser(User user);

    abstract public void addUser(User user);

    abstract public void deleteUser(User user);

    protected void incrementInsertions(){ totalInsertions++;}

    protected void incrementDeletes(){ totalDeletes++;}

}

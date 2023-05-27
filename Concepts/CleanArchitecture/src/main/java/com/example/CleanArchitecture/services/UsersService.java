package com.example.CleanArchitecture.services;

import com.example.CleanArchitecture.entities.User;
import com.example.CleanArchitecture.repositories.UsersDB;
import com.example.CleanArchitecture.repositories.UsersDBMemory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsersService {
    UsersDB usersDB = new UsersDBMemory();

    public UsersService(UsersDB usersDB){
        this.usersDB = usersDB;
    }

    public UsersService(){}

    public ArrayList<User> listUsers() {
        return usersDB.listUsers();
    }

    public User getUser(String username) {
        User user = new User();
        user.userName = username;

        return usersDB.getUser(user);
    }

    public void addUser(User user) {
        if (getUser(user.name) != null) {
            return;
        }

        usersDB.addUser(user);
    }

    public void deleteUser(String username) {
        User user = new User();
        user.userName = username;

        usersDB.deleteUser(user);
    }
}

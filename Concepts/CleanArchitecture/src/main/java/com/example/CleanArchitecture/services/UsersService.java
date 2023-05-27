package com.example.CleanArchitecture.services;

import com.example.CleanArchitecture.entities.User;
import com.example.CleanArchitecture.entities.UsersBuilder;
import com.example.CleanArchitecture.repositories.UsersDB;
import com.example.CleanArchitecture.repositories.UsersDBFactory;
import com.example.CleanArchitecture.repositories.UsersDBFile;
import com.example.CleanArchitecture.repositories.UsersDBMemory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsersService {
    //UsersDB usersDB = new UsersDBMemory();
    UsersDBFactory usersDBFactory = new UsersDBFactory("bbddFile");
    UsersDB usersDB = usersDBFactory.getDatabaseInstance();

    public UsersService() {
    }

    public ArrayList<User> listUsers() {
        return usersDB.listUsers();
    }

    public User getUser(String username) {
        User user = new User();
        user.username = username;

        return usersDB.getUser(user);
    }

    public void addUser(User user) {
        if (getUser(user.name) != null) {
            return;
        }

        User filterUser = addFilteredUser(user);

        usersDB.addUser(filterUser);
    }

    public void deleteUser(String username) {
        User user = new User();
        user.username = username;

        usersDB.deleteUser(user);
    }

    private User addFilteredUser(User user) {
        UsersBuilder usersBuilder = new UsersBuilder(user.username);

        return usersBuilder
                .withName(user.name.length() > 0 ? user.name : "Sin nombre")
                .withLastname(user.lastname.length() > 0 ? user.lastname : "Sin apellido")
                .withEmail(user.email.length() > 0 ? user.email : "Sin email")
                .withLevelAccess(user.levelAccess > 0 ? user.levelAccess : 0)
                .build();
    }
}

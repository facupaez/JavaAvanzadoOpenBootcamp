package com.company.O.good;

import java.util.ArrayList;

public class Users {

    // modificamos variable para poder utilizar la nueva clase de estadïsticas creada
    UsersDBStatistics usersDB = new UsersDBStatistics();

    public ArrayList<User> userList() {
        return usersDB.convertFileUsersIntoArrayList();
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

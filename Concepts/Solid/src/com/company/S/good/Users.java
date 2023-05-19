package com.company.S.good;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Users {

    // creamos variabe para ir asociando los meétodos que separamos
    private UsersDB usersDB = new UsersDB();

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

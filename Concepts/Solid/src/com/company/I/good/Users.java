package com.company.I.good;

import java.util.ArrayList;

public class Users {

    IUsersDB usersDB;

    public Users(IUsersDB usersDB){
        this.usersDB = usersDB;
    }

    public ArrayList<User> userList() {
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

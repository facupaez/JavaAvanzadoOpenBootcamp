package com.company.O.bad;

import java.util.ArrayList;

public class Users {

    // creamos variabe para ir asociando los métodos que separamos
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

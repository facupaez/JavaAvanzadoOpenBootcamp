package com.company.D.good;

import java.util.ArrayList;

/*
    En esta clase ya estamos implementando el principio de inversión de dependencias. Dependiendo de lo que fuera la
    variable usersDB (en main) ya está invocando a las funciones creadas en la interface.
 */
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

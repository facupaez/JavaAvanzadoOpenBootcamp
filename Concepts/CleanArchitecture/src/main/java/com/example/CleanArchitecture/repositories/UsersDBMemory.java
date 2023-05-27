package com.example.CleanArchitecture.repositories;

import com.example.CleanArchitecture.entities.User;

import java.util.ArrayList;

public class UsersDBMemory extends UsersDB{
    private ArrayList<User> users = new ArrayList<>();

    @Override
    public ArrayList<User> listUsers() {
        return users;
    }

    @Override
    public User getUser(User user) {

        for (User usuarioActual : listUsers()) {
            if (usuarioActual.username.equals(user.username)) {
                return usuarioActual;
            }
        }

        return null;
    }

    @Override
    public void addUser(User user) {
        if (getUser(user) != null) {
            return;
        }

        users.add(user);
        incrementInsertions();
    }

    @Override
    public void deleteUser(User user) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).username.equals(user.username)) {
                users.remove(i);
                incrementDeletes();
            }
        }
    }

}

package com.company.I.bad;

import java.util.ArrayList;

/**
 * Creamos implementación de base de datos en memoria.
 * Extendemos de la clase abstracta UsersDB la cual contiene los métodos abstractos a implementar.
 */
public class UsersDBMemory extends UsersDB {
    private ArrayList<User> users = new ArrayList<>();

    @Override
    public ArrayList<User> listUsers() {
        return users;
    }

    @Override
    public User getUser(User user) {

        for (User usuarioActual : listUsers()) {
            if (usuarioActual.userName.equalsIgnoreCase(user.userName)) {
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
    }

    @Override
    public void deleteUser(User user) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).userName.equalsIgnoreCase(user.userName)) {
                users.remove(i);
            }
        }
    }
}

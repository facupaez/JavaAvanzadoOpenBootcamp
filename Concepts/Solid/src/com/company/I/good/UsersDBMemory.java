package com.company.I.good;

import java.util.ArrayList;

/**
 * Implementamos UsersDB para simular base de datos en memoria.
 * Implementamos UsersDBStatistics para agregar nuevas funcionalidades.
 */
public class UsersDBMemory implements IUsersDB, IUsersDBStatistics{
    private int totalInsertions = 0;
    private int totalDeletes = 0;
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
        totalInsertions++;
    }

    @Override
    public void deleteUser(User user) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).userName.equalsIgnoreCase(user.userName)) {
                users.remove(i);
                totalDeletes++;
            }
        }
    }

    @Override
    public int getTotalInsertions() {
        return totalInsertions;
    }

    @Override
    public int getTotalDeletes() {
        return totalDeletes;
    }
}

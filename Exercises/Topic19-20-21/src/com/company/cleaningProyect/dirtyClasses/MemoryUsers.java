package com.company.cleaningProyect.dirtyClasses;

import com.company.cleaningProyect.cleanClasses.User;

import java.util.ArrayList;

public class MemoryUsers {
    ArrayList<com.company.cleaningProyect.cleanClasses.User> users = new ArrayList();

    public ArrayList<com.company.cleaningProyect.cleanClasses.User> usersList() {
        return users;
    }

    public com.company.cleaningProyect.cleanClasses.User getUser(String username) {
        for (com.company.cleaningProyect.cleanClasses.User user : users) {
            if (user.name.equalsIgnoreCase(username.toLowerCase())) {
                return user;
            }
        }

        return null;
    }

    public void addUser(com.company.cleaningProyect.cleanClasses.User user) {
        for (com.company.cleaningProyect.cleanClasses.User existingUser : users) {
            if (existingUser.name.toLowerCase().equals(user.name.toLowerCase())) {
                return;
            }
        }

        users.add(user);
    }

    public void deleteUser(String username) {
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (user.name.equalsIgnoreCase(username.toLowerCase())) {
                users.remove(i);
            }
        }
    }
}

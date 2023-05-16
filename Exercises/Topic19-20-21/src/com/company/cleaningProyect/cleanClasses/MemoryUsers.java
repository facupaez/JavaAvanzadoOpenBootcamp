package com.company.cleaningProyect.cleanClasses;

import java.util.ArrayList;

public class MemoryUsers {
    ArrayList<User> users = new ArrayList();

    public ArrayList<User> usersList() {
        return users;
    }

    public User getUser(String username) {
        for (User user : users) {
            if (user.name.equalsIgnoreCase(username.toLowerCase())) {
                return user;
            }
        }

        return null;
    }

    public void addUser(User user) {
        for (User existingUser : users) {
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

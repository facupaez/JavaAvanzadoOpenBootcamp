package com.company.DTO;

import java.util.ArrayList;

public class Users {
    ArrayList<User> users = new ArrayList<>();

    public User getUser(String name){
         for (User user : users){
             if (user.name.equals(name)){
                 return user;
             }
         }
         return null;
    }

    public void addUser(User user){
        users.add(user);
    }
}

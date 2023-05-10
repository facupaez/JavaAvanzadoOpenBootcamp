package com.company;

import java.util.ArrayList;

public class Users {
    ArrayList<String> users = new ArrayList<>();

    // corraboramos que no existan usuarios duplicados
    public void addUser(String name) throws RegisteredUsersException{
        for (String user : users){
            if(user.equals(name)){
                throw new RegisteredUsersException(name);
            }
        }
        users.add(name);
    }
}

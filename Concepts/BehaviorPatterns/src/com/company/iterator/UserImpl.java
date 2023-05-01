package com.company.iterator;

import java.util.ArrayList;

public class UserImpl implements IUser{

    // creamos lista de usuarios vacía
    private ArrayList<User> users = new ArrayList<>();

    // creamos indice de la lista usuarios para metodo next
    private int index = 0;

    // agregamos usuarios a la lista
    public void addUser(User user){
        users.add(user);
    }

    // implementamos metodos de la interace User
    @Override
    public User next() {
        User user = this.users.get(index);
        index = index + 1;

        return user;
    }

    @Override
    public void reset() {
        index = 0;
    }

    @Override
    public boolean hasMore() {
        return index < users.size();
    }
}

package com.company.strategy;

import com.company.iterator.User;

import java.util.ArrayList;

public class MemoryUsers implements Users {

    private ArrayList<String> users = new ArrayList<>();

    @Override

    public void add(String name) {
        users.add(name);
    }

    @Override
    public ArrayList<String> listAll() {
        return users;
    }
}

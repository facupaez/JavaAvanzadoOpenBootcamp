package com.example.CleanArchitecture.repositories;

public class UsersDBFactory {
    private String bbddType = "";

    public UsersDBFactory(String bbddType) {
        this.bbddType = bbddType;
    }

    public UsersDB getDatabaseInstance() {
        if (bbddType.equalsIgnoreCase("bbddMemory")) {
            return new UsersDBMemory();
        } else if (bbddType.equalsIgnoreCase("bbddFile")) {
            return new UsersDBFile();
        }

        return new UsersDBNullable();
    }
}

package com.company.strategy;

import com.company.iterator.User;

import java.util.ArrayList;

/**
 * @author Facu Paez
 * Tema: Patrones de comportamiento.
 * El patrón strategy te permite definir una familia de algoritmos, colocar cada uno de ellos en una clase
 * separada y hacer sus objetos intercambiables.
 * Por ej: una aplicación de finanzas que implementa distintos tipos de pagos.
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        FileUsers memoryUsers = new FileUsers();

        add(memoryUsers, "Pepe");
        add(memoryUsers, "Jose");
        add(memoryUsers, "Carlo");

        for (String user : memoryUsers.listAll()){
            System.out.println(user);
        }
    }

    public static void add(Users users, String name){
        users.add(name);
    }

    public static ArrayList<String> listAll(Users users){
        return users.listAll();
    }
}

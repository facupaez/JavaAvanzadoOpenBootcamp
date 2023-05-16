package com.company.DTO;

import java.util.ArrayList;

public class User {
    String name;
    ArrayList<Vehicle> vehicles = new ArrayList<>();

    private User(){}

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }
}

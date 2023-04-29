package com.company.builder;

public class CarBuilder {

    Vehicle vehicle;

    public CarBuilder(String brand){
        vehicle = new Vehicle();
        vehicle.setBrand(brand);
    }

    // retornamos la instancia actual de mi clase, esta funcion se devuelve a si misma lo cual permite
    // la programacion fluida
    public CarBuilder setDoors(int doors){
        vehicle.setDoors(doors);
        return this;
    }

    public CarBuilder setEngine(String engine){
        vehicle.setEngine(engine);
        return this;
    }

    // este metodo devuelve la instancia de la clase Vehiculo,
    // la cual usamos cuando instanciamos al objeto car
    public Vehicle build(){
        return this.vehicle;
    }
}

package com.company.O.examples;

// aplicando principio de abierto/cerrado con clase abstracta.
abstract class Vehicle {
    String type;

    public String getType() {
        return type;
    }
}

// clase existente abierta a su extensión pero cerrada a su modificación.
class ACar extends Vehicle{

    public ACar(String type) {
        this.type = type;
    }

}

// clase nueva la cual extendemos de la clase abstracta para aplicar el principio de abierto/cerrado.
class AElectricCar extends Vehicle{
    String battery;

    public AElectricCar(String type, String battery){
        this.type = type;
        this.battery = battery;
    }

    public String getBattery(){
        return battery;
    }
}

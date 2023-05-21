package com.company.O.examples;

// aplicando principio de abierto/cerrado con interfaces.
public interface IVehicle {
    String getType();
}

// clase existente abierta a su extensión pero cerrada a su modificación.
class Car implements IVehicle{
    String type;

    public Car(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return null;
    }
}

// clase nueva la cual implementamos la interface para aplicar el principio de abierto/cerrado.
class ElectricCar implements IVehicle{
    String type;
    String battery;

    public ElectricCar(String type, String battery){
        this.type = type;
        this.battery = battery;
    }

    @Override
    public String getType() {
        return null;
    }

    public String getBattery(){
        return battery;
    }
}

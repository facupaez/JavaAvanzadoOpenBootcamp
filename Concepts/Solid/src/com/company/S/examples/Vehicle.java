package com.company.S.examples;

public class Vehicle {
    private int velocity;

    public void speedUp(){
        velocity++;
    }

    public void brake(){
        velocity--;
    }

    public int getVelocity(){
        return velocity;
    }

    // este método rompe con el principio de responsabilidad única, ya que no pertenece a esta clase,
    // debería crearse una clase que trate de combustibles y después asociarla a la clase vehículo
    public void refuel(){

    }
}

package com.company.adapter;

public class Lamp implements IPluggable{
    boolean on = false;

    @Override
    public void on() {
        on = true;
        System.out.println("Lamp encendida");
    }

    @Override
    public void off() {
        on = false;
        System.out.println("Lamp apagada");
    }

    @Override
    public boolean isOn() {
        return on;
    }
}

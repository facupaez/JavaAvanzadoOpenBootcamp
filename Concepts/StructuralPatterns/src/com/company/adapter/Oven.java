package com.company.adapter;

public class Oven implements IPluggable{
    boolean on = false;

    @Override
    public void on() {
        on = true;
        System.out.println("Oven encendido");
    }

    @Override
    public void off() {
        on = false;
        System.out.println("Oven apagado");
    }

    @Override
    public boolean isOn() {
        return on;
    }
}

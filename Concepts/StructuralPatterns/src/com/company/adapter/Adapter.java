package com.company.adapter;

public class Adapter implements IPluggable{

    // instanciamos a la clase que vamos a adaptar
    public OtherLamp otherLamp = new OtherLamp();

    @Override
    public void on() {
        otherLamp.turnOn(110);
    }

    @Override
    public void off() {
        otherLamp.turnOff();
    }

    @Override
    public boolean isOn() {
        return otherLamp.isPowerOn();
    }
}

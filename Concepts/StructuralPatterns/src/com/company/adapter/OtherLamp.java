package com.company.adapter;

public class OtherLamp {
    boolean powerOn = false;
    int voltage = 0;

    public void turnOn(int voltage){
        powerOn = true;
        this.voltage = voltage;

        System.out.println("Otherlamp encendida con " + voltage);
    }

    public void turnOff(){
        powerOn = false;
        voltage = 0;

        System.out.println("Otherlamp apagada");
    }

    public boolean isPowerOn(){
        return powerOn;
    }
}

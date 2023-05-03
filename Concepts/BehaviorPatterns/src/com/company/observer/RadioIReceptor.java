package com.company.observer;

public class RadioIReceptor implements IReceptor {
    @Override
    public void receive() {
        System.out.println("Señal recibida en radio");
    }
}

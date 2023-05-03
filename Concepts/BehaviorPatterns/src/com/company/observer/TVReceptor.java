package com.company.observer;

public class TVReceptor implements IReceptor {
    @Override
    public void receive() {
        System.out.println("Señal recibida en TV");
    }
}

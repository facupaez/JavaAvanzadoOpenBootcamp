package com.company.observer;

public class SateliteIReceptor implements IReceptor {
    @Override
    public void receive() {
        System.out.println("Señal recibida en satélite");
    }
}

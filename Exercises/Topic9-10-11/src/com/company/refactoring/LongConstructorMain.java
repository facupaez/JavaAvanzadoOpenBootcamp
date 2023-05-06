package com.company.refactoring;

public class LongConstructorMain {

    public static void main(String[] args) {

        // solventando constructor largo
        LongConstructor longConstructor = new LongConstructor("Scania", "G450", "combustion", 3);

        //refactorizando aplicando patrón builder
        LongConstructorBuilder longConstructorBuilder = new LongConstructorBuilder("Scania")
                .withModel("G450")
                .withEngine("combustion")
                .withDoors(3);
    }
}

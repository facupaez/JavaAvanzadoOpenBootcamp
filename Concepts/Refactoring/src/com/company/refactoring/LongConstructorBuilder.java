package com.company.refactoring;

public class LongConstructorBuilder {

    String brand;
    String model;
    String engine;
    int doors;

    private LongConstructorBuilder() {
    }

    public LongConstructorBuilder (String brand) {
        this.brand = brand;
    }

    public LongConstructorBuilder withModel(String model) {
        this.model = model;
        return this;
    }

    public LongConstructorBuilder withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public LongConstructorBuilder withDoors(int doors) {
        this.doors = doors;
        return this;
    }
}

package com.company.S;

// Creamos clase car con una única responsabilidad de gestionar las propiedades y métodos.
public class Car {
    String brand;
    String color;
    String engineCode;

    public Car(String brand, String color, String engineCode) {
        this.brand = brand;
        this.color = color;
        this.engineCode = engineCode;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngineCode() {
        return engineCode;
    }

    public void setEngineCode(String engineCode) {
        this.engineCode = engineCode;
    }
}

package com.company.prototype;

public class Car implements Cloneable{

    private String brand;
    private String model;
    private int doors;

    public Car(){}

    // clonamos clase Car e igualamos propiedades (forma manual)
   /* public Car clone(){
        Car car = new Car();

        car.brand = this.brand;
        car.model = this.model;
        car.doors = this.doors;

        return car;
    }*/

    // clonamos clase Car e igualamos propiedades (forma Java)
    public Car cloneCar() throws CloneNotSupportedException{
        return (Car)this.clone();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", doors=" + doors +
                '}';
    }
}

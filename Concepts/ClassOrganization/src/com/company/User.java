package com.company;

public class User {
    // encapsulando propiedades
    private String name;
    private int age;
    private String address;
    private String email;

    public User(String name, int age, String address, String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
        // principio de responsabilidad única
        SendEmail emailSent = new SendEmail();
        emailSent.sendWelcomeEmail(email);
        // cohesionando clases
        UserAccess access = new UserAccess();
        access.setAttempts(access.getAttempts() + 1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

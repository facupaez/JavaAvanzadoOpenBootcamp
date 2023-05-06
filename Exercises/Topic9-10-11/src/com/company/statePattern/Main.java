package com.company.statePattern;

public class Main {

    public static void main(String[] args) {

        Telephone telephone1 = new Telephone();

        System.out.println(telephone1.status.unlock());
        System.out.println(telephone1.status.openCam());
        System.out.println(telephone1.status.makePhoto());
        System.out.println(telephone1.status.makePhoto());
    }
}

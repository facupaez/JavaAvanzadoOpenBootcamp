package com.company.I.examples.one;

public class Main {
    public static void main(String[] args) {
        operateWatch(new SmartWatchImpl());
    }

    public static void operateWatch(Object o){
        // si el objeto que le pasamos es de tipo WatchImpl
        if(o instanceof WatchImpl){
            System.out.println("Verdadero");
        }else{
            System.out.println("Falso");
        }
    }
}

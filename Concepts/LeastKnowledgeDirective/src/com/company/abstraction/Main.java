package com.company.abstraction;

/**
 * @author Facu Paez
 * Tema: Abstracción & Objetos y la directiva de menor conocimiento.
 * Abstracción es cuando definimos una serie de métodos abstractos en una clase abstracta los cuales implementamos
 * en clases derivadas. La clase abstracta también puede proveer métodos concretos.
 * Las clases abstractas NO puede instancearse, debo instancear una clase derivada de la misma.
 */
public class Main {

    public static void main(String[] args) {

        ElectricBill companyElectricBill = new CompanyElectricBill();
        System.out.println(companyElectricBill.calculate());

        ElectricBill userElectricBill = new UserElectricBill();
        System.out.println(userElectricBill.calculate());
    }
}

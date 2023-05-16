package com.company.abstraction;

public class UserElectricBill extends ElectricBill {
    @Override
    double getTax(double price) {
        return price * 21 / 100;
    }

    @Override
    double calculate() {
        return 0.55 * getTax(0.55);

    }
}

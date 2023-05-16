package com.company.abstraction;

public class CompanyElectricBill extends ElectricBill {
    @Override
    double getTax(double price) {
        return price * 7 / 100;
    }

    @Override
    double calculate() {
        return 0.90 * getTax(0.90);
    }

}

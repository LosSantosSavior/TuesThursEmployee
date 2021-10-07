package com.company;

public class CommissionedEmployee extends Employee {
    private int numberOfSales;
    public final static double commissionAmount = 100;

    public CommissionedEmployee() {
        numberOfSales = 0;
    }

    public void makeSale()   {
        numberOfSales++;
    }

    @Override
    public double calculateBiWeeklyPay() {
        var payAmount = 1000 + numberOfSales * commissionAmount;
        numberOfSales = 0;
        return payAmount;
    }
}

package com.company;

public abstract class Employee {
    public void fileW2Form()  {
        System.out.println("Generating W-2 form for this employee");
    }

    public abstract double calculateBiWeeklyPay();

    public void withholdTaxes() {
        System.out.println("Now withholding " +calculateBiWeeklyPay()*.2+ " in taxes.");
    }
}

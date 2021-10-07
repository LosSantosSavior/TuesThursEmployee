package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        var allEmployees = new ArrayList<Employee>();
        Employee newEmployee = new CommissionedEmployee();
        allEmployees.add(newEmployee);
        newEmployee = new SalariedEmployee(55000);
        allEmployees.add(newEmployee);
        //add more as needed here

        for(var emp : allEmployees) {
            System.out.println("Paying a " +emp.getClass().getName()+ " $"+emp.calculateBiWeeklyPay());
        }

        //WeekDay deliveryDay = WeekDay.Friday;
        //var RNG = new Random();
        //var choice = RNG.nextInt(WeekDay.values().length);
        //deliveryDay = WeekDay.values()[choice];
        //System.out.println("Your delivery day is: " + deliveryDay);
    }
}

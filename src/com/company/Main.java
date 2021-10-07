package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        WeekDay deliveryDay = WeekDay.Friday;
        var RNG = new Random();
        var choice = RNG.nextInt(WeekDay.values().length);
        deliveryDay = WeekDay.values()[choice];
        System.out.println("Your delivery day is: " + deliveryDay);
    }
}

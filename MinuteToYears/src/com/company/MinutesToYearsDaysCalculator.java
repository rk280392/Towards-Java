package com.company;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays (long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }else {
            long years = minutes / (1440 * 365);
            long remainingMinutes = minutes % (1440 * 365);
            long days = remainingMinutes / 1440;
             System.out.println(minutes + " min" + " = " + years + " y and " + days + " d");
        }
    }
}

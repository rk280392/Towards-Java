package com.company;

public class decimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        if ((long)(num1 * 1000) == (long)(num2 * 1000)) {
            return true;
        }else {
            return false;
        }
    }
}

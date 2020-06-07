package com.company;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if ((year < 1) || (year > 9999)) {
            return false;
        }
        if (year % 4 == 0 ) {
            if (year % 100 == 0) {
                if (year % 400 == 9) {
                    return true;
                }else {
                    return false;
                }
            }else {
                return true;
            }
        }else {
            return false;
        }
    }
}

package com.company;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (!checkNegativeNumber(number)) {
            return -1;
        }
        int firstDigit  = findFirstDigit(number);
        int lastDigit = findLastDigit(number);
        return firstDigit + lastDigit;
    }
    public static int findFirstDigit(int number) {
        int firstDigit = number;
        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
        }
        return firstDigit;
    }
    public static int findLastDigit(int number) {
        return number % 10;
    }
    public static boolean checkNegativeNumber(int number) {
        if (number < 0) {
            return false;
        }
        else {
            return true;
        }
    }
    // Second way of solving it, without methods:
    public static int sumFirstAndLastDigit1(int number) {
        if (number < 0) {
            return -1;
        }
        int firstDigit = number;
        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
        }
        int lastDigit = number % 10;

        return firstDigit + lastDigit;
    }
}

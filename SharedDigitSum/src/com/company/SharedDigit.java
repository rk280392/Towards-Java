package com.company;

public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 <10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        }
        int digit1 = num1 % 10;
        int digit2 = (num1 / 10) % 10;

        while (num2 > 0) {
         int lastDigit = num2 % 10;
         if (lastDigit == digit1 || lastDigit == digit2) {
             return true;
         }
         num2 = num2 / 10;
        }
        return false;
    }
}

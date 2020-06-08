package com.company;

public class isPalindrome {
    public static boolean isPalindrome (int number) {
        if(number < 0) {
            number *= -1;
        }
        int reverse = 0;
        int startingNumber = number;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            number = number / 10;
        }
        if (startingNumber == reverse) {
            return true;
        }
        return false;
    }
}


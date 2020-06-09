package com.company;

public class isPalindrome {
    public static boolean isPalindrome (int number) {
        int originalnumber = number;
        int reverse = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            System.out.println("lastDigit" + lastDigit);
            reverse = reverse * 10;
            reverse = lastDigit + reverse;
            System.out.println(reverse);
            number = number / 10;
        }
        if (reverse == originalnumber) {
            return true;
        }else {
            return false;
        }
    }
}


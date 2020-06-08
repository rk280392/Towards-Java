package com.company;

public class digitSumChallenge {
    public static int sumDigits(int number) {
        if (number < 10) return -1;
        int sum = 0;
        while (number > 0) {
         int leastSignificantDigit = number % 10;
         sum += leastSignificantDigit; 
         number = number / 10; // dropping leastsignificant digit
        }
        return sum;
    }
}

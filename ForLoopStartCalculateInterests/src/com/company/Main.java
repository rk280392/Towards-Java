package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        for (double i = 2; i < 9; i++) {
            System.out.println("Interest on " + i + " = " + calculateInterest(1000, i));
        }
        for (double i = 8; i > 1; i--) {
            System.out.println("Interest on " + i + " = " + calculateInterest(1000, i));
        }
    }
    public static double calculateInterest (double amount, double interests) {
        return (amount * (interests / 100));
        }
    }

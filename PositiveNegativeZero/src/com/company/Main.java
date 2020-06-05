package com.company;

public class Main {

    public static void main(String[] args) {
        Main check = new Main();
        int number = 0;
        check.checkNumber(number);
        System.exit(0);

    }
    public static void checkNumber(int number) {
        if (number == 0) {
            System.out.println("Entered number is 0");
        }
        else if (number > 0) {
            System.out.println("Entered number is a positive number");
        }
        else {
            System.out.println("Entered number is a negative number");
        }
    }
}

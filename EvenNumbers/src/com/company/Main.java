package com.company;

public class Main {

    public static void main(String[] args) {
        int start = 4;
        int end = 40;
        int countOfEvenNumbers = 0;
        while (start <= end) {
            start++;
            if (!EvenNumbers.isEven(start)) {
                continue;
            }
            System.out.println(start + " is even number");
            countOfEvenNumbers += 1;
            if (countOfEvenNumbers >= 5) {
                break;
            }
        }
        System.out.println(countOfEvenNumbers);
    }
}

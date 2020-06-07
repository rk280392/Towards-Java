package com.company;

public class Main {

    public static void main(String[] args) {
        int NumberOfPrimes = 0;
        for (int i=2; i< 1000; i++) {
           if (PrimeNumbers.isPrime(i)) {
               NumberOfPrimes ++;
               System.out.println("Number " + i + " is a prime number");
               if (NumberOfPrimes ==50) {
                   System.out.println("Exiting the loop");
                   break;
               }
           }
       }
        System.out.println(NumberOfPrimes);
    }
}

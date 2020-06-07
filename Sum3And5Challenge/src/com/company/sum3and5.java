package com.company;

// sum all the numbers that can be divided with both 3 and also with 5.
//For those numbers that met the above conditions, print out the number.
//break out of the loop once you find 5 numbers that met the above conditions.
//After breaking out of the loop print the sum of the numbers that met the above conditions.

public class sum3and5 {
    public static void findSumOf3and5Divisibles () {
        int count = 0;
        int sum = 0;
        for (int i=1; i<=1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i);
                sum += i;
                count++;
            }
            if (count > 5) {
                System.out.println("Exiting Loop");
                break;
            }
        }
        System.out.println(sum);
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	// Examples of while, do-while and comparision with for loop.
        int count = 1;
        while(count != 6) {
            System.out.println("The number is  " + count);
            count++;
        }
        for (count = 1; count != 6; count++) {
            System.out.println("The number is " + count);
        }
        count = 1;
        while(true) {
            if (count == 6) {
                break;
            }
            System.out.println("The number is " + count);
            count++;
        }
        count = 1;                                     // do while gets executed at least once, before termination due to expression condition.
        do {                                           // if we put count =6, loop will be executed for 6, and the with count ++, count will become 7, which will satisfy the condition of count !=6 and hence it will go on as infinite loop.
            System.out.println("The number is " + count);
            count++;
        }
        while(count !=6);
    }
}

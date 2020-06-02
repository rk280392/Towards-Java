package com.company;

public class Main {

    public static void main(String[] args) {
    double FirstValue = 20.00d;
    double SecondValue = 80.00d;
    double ResultValue = (FirstValue + SecondValue) * 100;
    System.out.println("Result of operation " + ResultValue);
    double RemainderValue = ResultValue % 40.00;
    System.out.println("Remainder Value " + RemainderValue);
    boolean RemainderBoolean = (RemainderValue == 0) ? true : false;
    System.out.println("Remainder Boolean" + RemainderBoolean);

    if (!RemainderBoolean) {
        System.out.println("Got some remainder");
    }


    }
}

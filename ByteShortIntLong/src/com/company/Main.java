package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("Minimum Value of Integer = " + minIntValue);
        System.out.println("Maximum value of Integer = " + maxIntValue);

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("Minimum value of byte = " + minByteValue);
        System.out.println("Maximum value of Byte = " + maxByteValue);

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("Minimum value of short = " + minShortValue);
        System.out.println("Maximum value of Short = " + maxShortValue);

        int myTotal = (minIntValue / 2);
        // java by default take Int datatype so no need to specify int above, but for other datatypes we will have to
        // specify their respective data type so Int will be converted to the datatype. This is called casting..

        byte myNewByteValue = (byte) (minByteValue / 2);
        short myNewShortValue = (short) (minShortValue / 2);

        byte myTestByteValue = 125;
        int myTestIntValue = 3245;
        short myTestShortValue = 12345;
        long myTestLongValue  = 50000L + 10L * (myTestByteValue + myTestIntValue + myTestShortValue);
        System.out.println("My long Value is " + myTestLongValue);

        short myTotalShortValue = (short) (1000 + 10 * (myTestByteValue + myTestIntValue + myTestShortValue));

    }
}

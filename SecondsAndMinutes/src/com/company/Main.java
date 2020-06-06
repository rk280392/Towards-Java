package com.company;

public class Main {

    public static void main(String[] args) {
	String result = secondsAndMinutes.getDurationString(65, 45);
        System.out.println(result);

        String result2 = secondsAndMinutes.getDurationString(3945);
        System.out.println(result2);
    }
}

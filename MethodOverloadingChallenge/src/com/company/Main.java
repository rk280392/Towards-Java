package com.company;

public class Main {

    public static void main(String[] args) {
	double result = calcFeetAndInchesToCentimeters(6, 0);
        System.out.println(result);
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if  ((feet >= 0) || (inches >= 0 && inches <= 12)) {
           double centimeters = (feet * 12) * 2.54;
           centimeters += inches * 2.54;
            System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
            return centimeters;
        } return -1;
    }
}

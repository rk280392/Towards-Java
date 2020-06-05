package com.company;

public class Main {

    public static void main(String[] args) {
        double centimeters = calcFeetAndInchesToCentimeters(6, 10);
        if (centimeters < 0.0) {
            System.out.println("Invalid Parameters");
        }
       calcFeetAndInchesToCentimeters(15);
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if  ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid parameters for inches and feet");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet and " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches = " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}

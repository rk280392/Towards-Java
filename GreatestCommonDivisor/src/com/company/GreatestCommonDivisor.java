package com.company;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if ( first < 10 || second < 10) {
            return -1;
        }
        int smaller;
        int larger;
        if (first < second) {
            smaller = first;
            larger = second;
        }
        else {
            smaller = second;
            larger = first;
        }
        int divisor = 0;
        for (int i = smaller; i>=1; i--) {
            if (( smaller % i == 0) && (larger % i ==0))  {
                divisor = i;
                break;
            }
        }
        return divisor;
    }
}

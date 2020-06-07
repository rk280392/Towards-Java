package com.company;

public class PrimeNumbers {
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i=2; i<= (long) Math.sqrt(n); i++) { // math.sqrt is more optimized then using n/2 as it allows lesser loops.
            if (n%i == 0) {
                return false;
            }
        }
        return  true;
    }
}

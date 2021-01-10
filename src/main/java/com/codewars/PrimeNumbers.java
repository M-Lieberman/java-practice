package com.codewars;

public class PrimeNumbers {
    public static boolean isPrimeSimple(int num) {
        // prime is >1
        // prime divisible only by itself and 1
        // simple approach
        // try to divide num with each number between 2 and num-1
        // return false if it is divides with 0 remainder
        // return false if num <=1
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // only need to check up to the square root of num
    public static boolean isPrimeSqrt(int num) {
        if (num <= 1) {
            return false;
        }
        // only need to check up to the square root of num
        //        for (int i = 2; i <= Math.sqrt(num); i++) {
        // only need to check up to the square root of num (or i*i <= num)
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isProbablePrime(int num) {
        return num > 1 && java.math.BigInteger.valueOf(num).isProbablePrime(20);
    }


    public static void main(String... args) {
        System.out.println(PrimeNumbers.isPrimeSimple(47));
        System.out.println(PrimeNumbers.isPrimeSqrt(34347));
        System.out.println(PrimeNumbers.isProbablePrime(23447));

    }
}

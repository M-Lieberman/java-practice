package com.codewars;

public class Fibonacci {

    public static long fib (int n) {
        // edge case -ve numbers
        if (n < 0 ) {
            throw new IllegalArgumentException("n cannot be negative");
        } else if (n == 0 || n == 1) {
            return n;
        }

        int currMinus2 = 0;
        int currMinus1 = 1;
        int current = 0;

        for (int i = 1; i < n; i++) {
            current = currMinus1 + currMinus2;
            currMinus2 = currMinus1;
            currMinus1 = current;
        }
        return current;
    }


    public static long fibInefficient (int n){
        // fib numbers are the sum of the previous 2 numbers
        // 0, 1, 1, 2, 3, 5, 8, 13,
        // 0, 1 are the base numbers
        // recursive way - call method to get the sum of fib(n-1) and fib(n-2)
        if (n == 0 || n == 1) {
            return n;
        }
        return fibInefficient(n - 1) + fibInefficient(n - 2);
    }

}

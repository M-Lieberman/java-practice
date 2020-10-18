package com.codewars;

public class ReturnNegative {


    public static int makeNegativeAlt(final int x) {
        return (x == 0 || x == Math.abs(x)) ? x : x * -1;
    }

    public static int makeNegative(final int x) {
        return -Math.abs(x);
    }

}

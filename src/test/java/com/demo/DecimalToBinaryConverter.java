package com.demo;

import java.util.Stack;

public class DecimalToBinaryConverter {

    public String decimalToBinaryMethod(int number) {
        return Integer.toBinaryString(number);
    }

    public String decimalToBinaryStack(int number) {

        Stack<Integer> stack = new Stack<>();

        while (number != 0) {
            int d = number % 2;
            stack.push(d);
            number /= 2;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }


    public static void main(String... args) {
        DecimalToBinaryConverter converter = new DecimalToBinaryConverter();
        System.out.println(converter.decimalToBinaryMethod(45));
        System.out.println(converter.decimalToBinaryStack(45));
    }

}

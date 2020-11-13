package com.demo;

import java.util.Arrays;
import java.util.Collections;

public class ReverseStringJoin {
    // join a string with -

    public String reverseWords(String sentence) {
        StringBuilder rb = new StringBuilder();
        // reverse all letters
        System.out.println(rb.append(sentence).reverse());

        String[] words = sentence.split(" ");
        Collections.reverse(Arrays.asList(words));

        return String.join("-", words);
    }

    public String reverseString(String sentence) {
        StringBuilder sb = new StringBuilder(sentence);
        return new StringBuilder(sentence).reverse().toString();
    }

    public static void main(String... args) {
        ReverseStringJoin rsj = new ReverseStringJoin();

        System.out.println(rsj.reverseWords("hello world of warcraft"));
        System.out.println(rsj.reverseString("abcd efg"));
    }
}

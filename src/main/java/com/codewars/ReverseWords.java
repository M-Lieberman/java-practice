package com.codewars;

import java.util.Arrays;
import java.util.Collections;

public class ReverseWords {
    public static String reverseWords(String str){
        String[] words = str.split(" ");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }
}

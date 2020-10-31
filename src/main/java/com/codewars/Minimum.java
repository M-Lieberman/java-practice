package com.codewars;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * https://www.codewars.com/kata/5ac6932b2f317b96980000ca/train/java
 */
public class Minimum {

    // my solution
    public static int PrettyminValue(int[] values) {
        Arrays.sort(values);
        StringBuilder builder = new StringBuilder();
        int prev = values[0];
        builder.append(prev);
        for (int i = 1; i < values.length; i++) {
            if (values[i] != prev) {
                builder.append(values[i]);
            }
            prev = values[i];
        }
        return Integer.parseInt(builder.toString());
    }


    // alternative solution
    public static int minValue_streams(int[] values) {
        String s = Arrays.stream(values)
                .sorted()
                .distinct()
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(""));
        return Integer.valueOf(s);
    }

}
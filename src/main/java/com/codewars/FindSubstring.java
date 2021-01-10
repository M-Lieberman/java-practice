package com.codewars;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.codewars.com/kata/5778aa7c82d7d0b49c00001a/solutions/java
 * Write a function that takes two strings, A and B, and returns the length of the longest possible substring that can be formed from the concatenation of either A + B or B + A containing only characters that do not appear in both A and B.
 *
 * Example:
 * Given the strings "piquancy" and "refocusing":
 * A = "piquancy"
 * B = "refocusing"
 * A + B = "piquancyrefocusing"
 * B + A = "refocusingpiquancy"
 *
 * Since 'i', 'n', 'u', and 'c' appear in both A and B, all acceptable substrings without those characters are:
 * "p", "q", "a", "yrefo", "s", "g" (from A + B)
 * "refo", "s", "gp", "q", "a", "y" (from B + A)
 *
 * Therefore, it would be correct to return 5: the length of "yrefo".
 */
public class FindSubstring {




    static int longestSubstring(String a, String b){

        String ab = a + b;
        String ba = b + a;
        List<Character> repeatChar = new ArrayList<Character>();

        for(int i = 0; i < a.length(); i++){
            if (b.indexOf(a.charAt(i)) >= 0){
                repeatChar.add(a.charAt(i));
            }
        }

        int countAB = 0;
        int countBA = 0;
        int best = 0;
        for (int i = 0; i< ab.length(); i++){
            if (!repeatChar.contains(ab.charAt(i)))
                countAB++;
            else
                countAB = 0;

            if (!repeatChar.contains(ba.charAt(i)))
                countBA++;
            else
                countBA = 0;

            if (countAB > best)
                best = countAB;
            if (countBA > best)
                best = countBA;
        }
        return best;

    }
}

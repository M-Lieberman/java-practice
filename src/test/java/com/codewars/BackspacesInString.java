package com.codewars;

import java.util.Deque;
import java.util.LinkedList;


/**
 * https://www.codewars.com/kata/5727bb0fe81185ae62000ae3/train/java
 */

public class BackspacesInString {

    public String cleanString(String s) {
        // create char array from string
        // could we use a stack for the letters?

        char[] chars = s.toCharArray();
        Deque<Character> stack = new LinkedList<>();

        for(char c : chars) {
            if (c != '#') {
                stack.push(c);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char c : stack) {
            sb.append(c);
        }

        return sb.reverse().toString();

    }

        public String cleanStringRegex(String s) {
            while (s.matches(".*[^#]#.*")) s = s.replaceAll("[^#]#", "");
            return s.replaceAll("#","");
        }


//    public class SolutionTest {
//        @Test
//        public void testCleanString() {
//            final BackspacesInString bis = new BackspacesInString();
//            assertEquals("ac", bis.cleanString("abc#d##c"));
//            assertEquals("", bis.cleanString("abc####d##c#"));
//        }
//    }

}


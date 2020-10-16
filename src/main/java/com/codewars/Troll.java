package com.codewars;

public class Troll {

        public static String disemvowel(String Z) {
            return Z.replaceAll("(?i)[aeiou]" , "");
        }

}

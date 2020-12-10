package com.codewars;

/**
 * https://www.codewars.com/kata/5b180e9fedaa564a7000009a/train/java
 * Fix String Case
 * In this Kata, you will be given a string that may have mixed uppercase and lowercase letters and
 * your task is to convert that string to either lowercase only or uppercase only based on:
 * make as few changes as possible.
 * if the string contains equal number of uppercase and lowercase letters, convert the string to lowercase.
 * For example:
 *
 * solve("coDe") = "code". Lowercase characters > uppercase. Change only the "D" to lowercase.
 * solve("CODe") = "CODE". Uppercase characters > lowecase. Change only the "e" to uppercase.
 * solve("coDE") = "code". Upper == lowercase. Change all to lowercase.
 */
public class FixStringCase {
    public static String solve(final String str) {
        int upper = 0;
        int lower = 0;
        char[] chars = str.toCharArray();
        for (char c: chars) {
            if (Character.isUpperCase(c)) {
                upper++;
            } else if (Character.isLowerCase(c)) {
                lower++;
            }
        }
        if (lower >= upper) {
            for (int i = 0; i<chars.length ; i++) {
                if (Character.isUpperCase(chars[i])) {
                    chars[i] = Character.toLowerCase(chars[i]);
                }
            }
        } else {
            for (int i = 0; i<chars.length ; i++) {
                if (Character.isLowerCase(chars[i])) {
                    chars[i] = Character.toUpperCase(chars[i]);
                }
            }
        }
        return String.valueOf(chars);
    }

    public static String solveWithFilter(final String str) {
        return str.chars().filter(Character::isLowerCase).count() >= str.chars().filter(Character::isUpperCase).count()
                ? str.toLowerCase()
                : str.toUpperCase();
    }
}
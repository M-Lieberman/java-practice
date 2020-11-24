package com.codewars;

import java.util.HashSet;
import java.util.Set;

/**
 * https://www.codewars.com/kata/545cedaa9943f7fe7b000048/train/java
 * A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).
 * Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
 */
public class PangramChecker {
    public boolean check(String sentence){
        //code
        // can we us regex?
        // compare string with alphabet string, counter through chars (ascii 65 = A)
        // ignore case
        // capital A
        String upSentence = sentence.toLowerCase().replaceAll("^[a-z]", "");
        System.out.println(upSentence);
        Set<Character> letters = new HashSet<>();
        for (int i = 0; i < upSentence.length(); i++) {
            if (upSentence.charAt(i) >-1) {
                letters.add(upSentence.charAt(i));
            }
        }
        return letters.size() >= 26;
    }


    public boolean checkAlt(String sentence){
        for (char c = 'a'; c<='z'; c++)
            if (!sentence.toLowerCase().contains("" + c))
                return false;
        return true;
    }

    public boolean checkMapFilter(String sentence){
        return sentence.chars().map(Character::toLowerCase).filter(Character::isAlphabetic).distinct().count() == 26;
    }
}

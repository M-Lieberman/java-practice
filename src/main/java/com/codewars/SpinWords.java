package com.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Write a function that takes in a string of one or more words, and returns the same string, but with all five or more letter words reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.
 *
 * Examples: spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw" spinWords( "This is a test") => returns "This is a test" spinWords( "This is another test" )=> returns "This is rehtona test"
 */
public class SpinWords {

    public String spinWords(String sentence) {
        // split into an array of strings
        // loop through each word
        // if word is > 5 chars - reverse it (StringBuilder.reverse)
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.length() >= 5) {
                StringBuilder r = new StringBuilder(word);
                sb.append(r.reverse());
            } else {
                sb.append(word);
            }
            sb.append(" ");
        }
        return String.join(" ",words);
    }



    public String spinWordsOriginal(String sentence) {
        // split into an array of strings
        // loop through each word
        // if word is > 5 chars - reverse it (StringBuilder.reverse)
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.length() >= 5) {
                StringBuilder r = new StringBuilder(word);
                sb.append(r.reverse());
            } else {
                sb.append(word);
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }


    public String spinWordsAlt(String sentence) {
        String[] words = sentence.split(" ");
        for (int i=0; i<words.length; i++) {
            if (words[i].length() >= 5) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ",words);
    }

    public String spinWordsStreams(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(i -> i.length() > 4 ? new StringBuilder(i).reverse().toString() : i)
                .collect(Collectors.joining(" "));
    }

}

package com.codewars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://www.codewars.com/kata/5375f921003bf62192000746/train/java
 * The word i18n is a common abbreviation of internationalization in the developer community, used instead of typing the whole word and trying to spell it correctly. Similarly, a11y is an abbreviation of accessibility.
 *
 * Write a function that takes a string and turns any and all "words" (see below) within that string of length 4 or greater into an abbreviation, following these rules:
 *
 * A "word" is a sequence of alphabetical characters. By this definition, any other character like a space or hyphen (eg. "elephant-ride") will split up a series of letters into two words (eg. "elephant" and "ride").
 * The abbreviated version of the word should have the first letter, then the number of removed characters, then the last letter (eg. "elephant ride" => "e6t r2e").
 * Example
 * abbreviate("elephant-rides are really fun!")
 * //          ^^^^^^^^*^^^^^*^^^*^^^^^^*^^^*
 * // words (^):   "elephant" "rides" "are" "really" "fun"
 * //                123456     123     1     1234     1
 * // ignore short words:               X              X
 *
 * // abbreviate:    "e6t"     "r3s"  "are"  "r4y"   "fun"
 * // all non-word characters (*) remain in place
 * //                     "-"      " "    " "     " "     "!"
 * === "e6t-r3s are r4y fun!"
 */
public class Abbreviator {

    public String abbreviate(String string) {
        // pattern match with regex all words we need to change
        Pattern p = Pattern.compile("[a-z]{4,}", Pattern.CASE_INSENSITIVE);
        Matcher matcher = p.matcher(string);

        StringBuilder sb = new StringBuilder();
        // matcher.find() searches for matches until it cannot find anymore
        while (matcher.find()) {
            // matcher.group() grants access to the matching text within the group
            String g = matcher.group();
//            System.out.println("matching group=" + g);
            int length = g.length();
            // matcher.appendReplacement() keeps track of what has been copied into StringBuilder,
            // so can update these during the append
            matcher.appendReplacement(sb, g.substring(0, 1) + (length - 2) + g.substring(length - 1, length));
        }
        // match.appendTail() appends characters from the end of the last match
        matcher.appendTail(sb);
        return sb.toString();
    }

}

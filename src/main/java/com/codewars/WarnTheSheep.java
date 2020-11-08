package com.codewars;

import java.util.Arrays;
import java.util.Collections;

/**
 * https://www.codewars.com/kata/5c8bfa44b9d1192e1ebd3d15/train/java
 * A wolf in sheep's clothing
 * Wolves have been reintroduced to Great Britain. You are a sheep farmer, and are now plagued by wolves which pretend to be sheep. Fortunately, you are good at spotting them.
 *
 * Warn the sheep in front of the wolf that it is about to be eaten. Remember that you are standing at the front of the queue which is at the end of the array:
 *
 * [sheep, sheep, sheep, sheep, sheep, wolf, sheep, sheep]      (YOU ARE HERE AT THE FRONT OF THE QUEUE)
 *    7      6      5      4      3            2      1
 * If the wolf is the closest animal to you, return "Pls go away and stop eating my sheep". Otherwise, return "Oi! Sheep number N! You are about to be eaten by a wolf!" where N is the sheep's position in the queue.
 *
 * Note: there will always be exactly one wolf in the array.
 *
 * Examples
 * warnTheSheep(["sheep", "sheep", "sheep", "wolf", "sheep"]) === "Oi! Sheep number 1! You are about to be eaten by a wolf!"
 *
 * warnTheSheep(["sheep", "sheep", "wolf"]) === "Pls go away and stop eating my sheep"
 */
public class WarnTheSheep {
    // if the item is a wolf save as wolf position
    // if the wolf is at the array end/front of queue return "Oi"
    // if the wolf is between sheep, the sheep position is wolf position + 1
    // the sheep number is array.length - sheep position
    public static String warnTheSheep(String[] array) {
        int wolfPosition = array.length;
        // loop through the array
        for (int i = 0; i < array.length; i++) {
            // if the item is a sheep move onto the next
            if ("wolf".equals(array[i])) {
                wolfPosition = i;
            }
        }
        if (wolfPosition == array.length - 1) {
            return "Pls go away and stop eating my sheep";
        } else {
            int sheepCount = array.length - 1;
            int sheepPosition = wolfPosition + 1;
            int sheepNumber = array.length - sheepPosition;
            return "Oi! Sheep number " + sheepNumber + "! You are about to be eaten by a wolf!";
        }
    }

    public static String warnTheSheepArrayList(String[] array) {
        Collections.reverse(Arrays.asList(array));
        int pos = Arrays.asList(array).indexOf("wolf");
        return pos == 0 ? "Pls go away and stop eating my sheep" : "Oi! Sheep number " + pos + "! You are about to be eaten by a wolf!";
    }

}

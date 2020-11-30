package com.codewars;

/**
 * https://www.codewars.com/kata/5abd66a5ccfd1130b30000a9/java
 * Scenario
 * Several people are standing in a row divided into two teams. The first person goes into team 1, the second goes into team 2, the third goes into team 1, and so on.
 *
 * Task
 * Given an array of positive integers (the weights of the people), return a new array/tuple of two integers, where the first one is the total weight of team 1, and the second one is the total weight of team 2.
 *
 * Notes
 * Array size is at least 1.
 * All numbers will be positive.
 * Input >> Output Examples
 * rowWeights([13, 27, 49])  ==>  return (62, 27)
 * Explanation:
 * The first element 62 is the total weight of team 1, and the second element 27 is the total weight of team 2.
 *
 * rowWeights([50, 60, 70, 80])  ==>  return (120, 140)
 * Explanation:
 * The first element 120 is the total weight of team 1, and the second element 140 is the total weight of team 2.
 *
 * rowWeights([80])  ==>  return (80, 0)
 * Explanation:
 * The first element 80 is the total weight of team 1, and the second element 0 is the total weight of team 2.
 */
public class RowWeights {
    public static int[] rowWeights (final int[] weights)
    {
        // read in array elements
        // alternate adding the weight between two total variables
        // odd into team 1, even into team 2
        // return the values as a new array of 2 elements
        int team1 = 0;
        int team2 = 0;
        for (int i=0; i < weights.length ; i++) {
            if (i % 2 == 0) {
                team1 += weights[i];
            } else {
                team2 += weights[i];
            }
        }
        return new int[]{team1, team2}; // Do your magic!
    }


    public static int[] rowWeightsAlt (final int[] weights) {
        int totals[] = new int[2], idx = 0;
        for (int w : weights) totals[(idx++)%2] += w;
        return totals;
    }
}

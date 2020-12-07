package com.codewars;

import java.util.StringJoiner;

/**
 * https://www.codewars.com/kata/5a2fd38b55519ed98f0000ce/train/java
 * Your goal is to return multiplication table for number that is always an integer from 1 to 10.
 *
 * For example, a multiplication table (string) for number == 5 looks like below:
 *
 * 1 * 5 = 5
 * 2 * 5 = 10
 * 3 * 5 = 15
 * 4 * 5 = 20
 * 5 * 5 = 25
 * 6 * 5 = 30
 * 7 * 5 = 35
 * 8 * 5 = 40
 * 9 * 5 = 45
 * 10 * 5 = 50
 * P. S. You can use \n in string to jump to the next line.
 */
public class MultiTable {

    public static String multiTable(int num) {
        StringJoiner sj = new StringJoiner("\n");
        for (int i = 1; i < 11; i++) {
            sj.add(i + " * " + num + " = " + i*num);
        }
        return sj.toString();
    }

    public static String multiTableSB(int num) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            int result = i * num;
            sb.append(i + " * " + num + " = " + result + "\n");
        }
        return sb.toString().trim();
    }

    public static String multiTableStringArray(int num) {
        String arr[] = new String[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.format("%d * %d = %d", i + 1, num, (i + 1) * num);
        }
        return String.join("\n", arr);
    }

//    @Test
//    public void basicTests() {
//        Tester.doTest(5, "1 * 5 = 5\n2 * 5 = 10\n3 * 5 = 15\n4 * 5 = 20\n5 * 5 = 25\n6 * 5 = 30\n7 * 5 = 35\n8 * 5 = 40\n9 * 5 = 45\n10 * 5 = 50");
//        Tester.doTest(1, "1 * 1 = 1\n2 * 1 = 2\n3 * 1 = 3\n4 * 1 = 4\n5 * 1 = 5\n6 * 1 = 6\n7 * 1 = 7\n8 * 1 = 8\n9 * 1 = 9\n10 * 1 = 10");
//    }
}

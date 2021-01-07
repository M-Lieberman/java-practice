package com.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StringDemo {

    protected static List<String> copyStringToListOfWords(String inputString) {
        List<String> result = new ArrayList<String>();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (c != ';') {
                sb.append(c);
                if (i == inputString.length() - 1) {
                    if (sb.length() > 0) result.add(sb.toString());
                    sb = new StringBuffer();
                }
            } else {
                if (sb.length() > 0) result.add(sb.toString());
                sb = new StringBuffer();
            }

        }
        return result;
    }

    protected static String reduce(ArrayList<String> inStrings) {
        ArrayList<String> workingList = inStrings;
        while (workingList.size() != 1) {
            int maxOverlap = 0;
            int[] latest = {0, 0};
            int indexTwo = 0;
            int maxIndex2 = 0;
            int maxIndex1 = 0;
            for (String two : workingList) {
                int indexOne = 0;
                for (String one : workingList) {
                    if (indexOne != indexTwo && maxOverlap <= overlap(one, two)[1]) {
                        maxOverlap = overlap(one, two)[1];
                        latest = overlap(one, two);
                        maxIndex1 = indexOne;
                        maxIndex2 = indexTwo;
                    }
                    indexOne++;
                }
                indexTwo++;
            }
            if (latest[0] + latest[1] < workingList.get(maxIndex1).length()) {
                workingList.remove(maxIndex2);
            } else {
                workingList.set(maxIndex1, workingList.get(maxIndex1) + workingList.get(maxIndex2).substring(maxOverlap));
                workingList.remove(maxIndex2);
            }
        }
        return workingList.get(0);
    }

    protected static int[] overlap(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            boolean match = true;
            int count = 0;
            while ((count + i) < s1.length() && count < s2.length()) {
                if (s1.charAt(i + count) != s2.charAt(count)) {
                    match = false;
                    break;
                }
                count++;
            }
            int[] result = {i, count};
            if (match && ((count + i) == s1.length() || count == s2.length())) return result;
        }
        int[] result = {0, 0};
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(args[0]));
        StringBuffer sb = new StringBuffer();
        String line;

        while ((line = in.readLine()) != null) {
            sb.append(line + ";");
        }
        //Convert to list of strings
        List<String> snippets = copyStringToListOfWords(sb.toString());


        System.out.println(reduce((ArrayList<String>) snippets));
    }
}
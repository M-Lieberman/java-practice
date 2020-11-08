package com.testdome;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeNames {


    public static String[] uniqueNames(String[] names1, String[] names2) {


        Set<String> uniqueNames = new HashSet<>(Arrays.asList(names1));
        System.out.println(uniqueNames);
        for (String name : names2) {
            uniqueNames.add(name);
        }
        System.out.println("end: " + uniqueNames);
        String[] strArray = new String[uniqueNames.size()];
        uniqueNames.toArray(strArray);
        return strArray;
    }

    public static void main(String[] args) {
        String[] names1 = new String[]{"Ava", "Emma", "Olivia"};
        String[] names2 = new String[]{"Olivia", "Sophia", "Emma"};

        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}

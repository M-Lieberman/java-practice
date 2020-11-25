package com.codewars;

public class FindScreenSize {

    public static String findScreenHeight(int width, String ratio) {
        // width input
        // ratio width:height
        // so height = (width/width ratio) * height ratio
        // extract ratios from string
        int colonPos = ratio.indexOf(":");
        int widthRatio = Integer.valueOf(ratio.substring(0, colonPos));
        int heightRatio = Integer.valueOf(ratio.substring(colonPos + 1));
        System.out.println(ratio + ">>>" + widthRatio + "!" + heightRatio);
        // need float to calculate the values correctly for the tests
        float w = (float)width / widthRatio;
        float height = w * heightRatio;
        return width + "x" + (int)height;
    }

    public static String findScreenHeightSplit(int width, String ratio) {
        String[] r = ratio.split(":");
        int height = width * Integer.valueOf(r[1]) / Integer.valueOf(r[0]);
        return width + "x" + height;
    }

}

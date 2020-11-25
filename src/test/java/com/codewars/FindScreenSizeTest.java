package com.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindScreenSizeTest {
    @Test
    public void test4By3() {
        assertEquals("1024x768", FindScreenSize.findScreenHeight(1024,"4:3"));
    }
    @Test
    public void test16By9() {
        assertEquals("1280x720", FindScreenSize.findScreenHeight(1280,"16:9"));
    }
    @Test
    public void test32By9() {
        assertEquals("3840x1080", FindScreenSize.findScreenHeight(3840,"32:9"));
    }

    public void basicTests() {
        assertEquals("ratio = 4:3, width = 1600", "1600x1200", FindScreenSize.findScreenHeight(1600,"4:3"));
        assertEquals("ratio = 5:4, width = 1280", "1280x1024", FindScreenSize.findScreenHeight(1280,"5:4"));
        assertEquals("ratio = 3:2, width = 2160", "2160x1440", FindScreenSize.findScreenHeight(2160,"3:2"));
        assertEquals("ratio = 16:9, width = 1920", "1920x1080", FindScreenSize.findScreenHeight(1920,"16:9"));
        assertEquals("ratio = 32:9, width = 5120", "5120x1440", FindScreenSize.findScreenHeight(5120,"32:9"));
    }

}
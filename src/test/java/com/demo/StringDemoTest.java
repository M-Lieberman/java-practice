package com.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StringDemoTest {

    @BeforeEach
    void setUp() throws Exception {
    }

    @Test
    void test1() {
        String input = "m quaerat voluptatem.;pora incidunt ut labore et d;, consectetur, adipisci velit;olore magnam"+
                "aliqua;idunt ut labore et dolore magn;uptatem.;i dolorem ipsum qu;iquam quaerat vol;psum quia"+
                "dolor sit amet, consectetur, a;ia dolor sit amet, conse;squam est, qui do;Neque porro quisquam est,"+
                "qu;aerat voluptatem.;m eius modi tem;Neque porro qui;, sed quia non numquam ei;lorem ipsum"+
                "quia dolor sit amet;ctetur, adipisci velit, sed quia non numq;unt ut labore et dolore magnam aliquam"+
                "qu;dipisci velit, sed quia non numqua;us modi tempora incid;Neque porro quisquam est, qui"+
                "dolorem i;uam eius modi tem;pora inc;am al";
        String output="Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed" +
                "quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat" +
                "voluptatem.";
        List<String> inputList = StringDemo.copyStringToListOfWords(input);
        assertTrue( output.equals(StringDemo.reduce((ArrayList<String>) inputList)));
    }

    @Test
    void test3() {
        String input = "m quaerat voluptatem.;pora incidunt ut labore et d;, consectetur, adipisci velit;olore magnam "+
                "aliqua;idunt ut labore et dolore magn;uptatem.;i dolorem ipsum qu;iquam quaerat vol;psum quia "+
                "dolor sit amet, consectetur, a;ia dolor sit amet, conse;squam est, qui do;Neque porro quisquam est, "+
                "qu;aerat voluptatem.;m eius modi tem;Neque porro qui;, sed quia non numquam ei;lorem ipsum "+
                "quia dolor sit amet;ctetur, adipisci velit, sed quia non numq;unt ut labore et dolore magnam aliquam "+
                "qu;dipisci velit, sed quia non numqua;us modi tempora incid;Neque porro quisquam est, qui "+
                "dolorem i;uam eius modi tem;pora inc;am al";
        String output="Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed " +
                "quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat " +
                "voluptatem.";
        List<String> inputList = StringDemo.copyStringToListOfWords(input);
        assertEquals("Big2", output.equals(StringDemo.reduce((ArrayList<String>) inputList)));
    }
    @Test
    void test4() {
        String input = "m quaerat voluptatem.;pora incidunt ut labore et d;, consectetur, adipisci velit;olore magnam;"+
                "aliqua;idunt ut labore et dolore magn;uptatem.;i dolorem ipsum qu;iquam quaerat vol;psum quia;"+
                "dolor sit amet, consectetur, a;ia dolor sit amet, conse;squam est, qui do;Neque porro quisquam est,;"+
                "qu;aerat voluptatem.;m eius modi tem;Neque porro qui;, sed quia non numquam ei;lorem ipsum;"+
                "quia dolor sit amet;ctetur, adipisci velit, sed quia non numq;unt ut labore et dolore magnam aliquam;"+
                "qu;dipisci velit, sed quia non numqua;us modi tempora incid;Neque porro quisquam est, qui;"+
                "dolorem i;uam eius modi tem;pora inc;am al";
        String output="Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed " +
                "quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat " +
                "voluptatem.";
        List<String> inputList = StringDemo.copyStringToListOfWords(input);
        assertEquals("Big3", output.equals(StringDemo.reduce((ArrayList<String>) inputList)));
    }

    @Test
    void test5() {
        assertEquals("overlap 3", StringDemo.overlap("ABCDEF","DEFG")[1]==3);
    }
    @Test
    void test6() {
        assertEquals("overlap 3", StringDemo.overlap("XYZABC","ABCDEF")[1]==3);
    }
    @Test
    void test7() {
        assertEquals("overlap 4", StringDemo.overlap("ABCDEF","BCDE")[1]==4);
    }
    @Test
    void test8() {
        assertEquals("overlap 0", StringDemo.overlap("ABCDEF","XCDEZ")[1]==0);
    }    
    
}
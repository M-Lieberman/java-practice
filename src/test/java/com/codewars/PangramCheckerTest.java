package com.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PangramCheckerTest {
    @Test
    public void test1() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        PangramChecker pc = new PangramChecker();
        assertEquals(true, pc.check(pangram1));
    }
    @Test
    public void test2() {
        String pangram2 = "You shall not pass!";
        PangramChecker pc = new PangramChecker();
        assertEquals(false, pc.check(pangram2));
    }

    @Test
    public void test3() {
        String pangram1 = "Cwm fjord bank glyphs vext quiz";
        PangramChecker pc = new PangramChecker();
        assertEquals(true, pc.check(pangram1));
    }
    @Test
    public void test4() {
        String pangram2 = "Pack my box with five dozen liquor jugs.";
        PangramChecker pc = new PangramChecker();
        assertEquals(true, pc.check(pangram2));
    }
    @Test
    public void test5() {
        String pangram3 = "How quickly daft jumping zebras vex.";
        PangramChecker pc = new PangramChecker();
        assertEquals(true, pc.check(pangram3));
    }
    @Test
    public void test6() {
        String pangram4 = "ABCD45EFGH,IJK,LMNOPQR56STUVW3XYZ";
        PangramChecker pc = new PangramChecker();
        assertEquals(true, pc.check(pangram4));
    }
    @Test
    public void test7() {
        String pangram5 = "abcdefghijklmopqrstuvwxyz";
        PangramChecker pc = new PangramChecker();
        assertEquals(false, pc.check(pangram5));
    }
    @Test
    public void test8() {
        String pangram6 = "A pangram is a sentence that contains every single letter of the alphabet at least once.";
        PangramChecker pc = new PangramChecker();
        assertEquals(false, pc.check(pangram6));
    }
}
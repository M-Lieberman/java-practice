package com.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbbreviatorTest {
    private Abbreviator abbr = new Abbreviator();

    @Test
    public void testInternationalization() {
        assertEquals("i18n", abbr.abbreviate("internationalization"));
        assertEquals("b3y i4d", abbr.abbreviate("barry island"));
        assertEquals("b2r-c2w", abbr.abbreviate("bear-claw"));
//     assertEquals("b2r-c2w r2k*s2r", abbr.abbreviate("bear-claws rock*star"));
    }

}
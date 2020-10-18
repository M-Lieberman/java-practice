package com.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class isogramTest {
    @Test
    public void testIsogram() {
        assertTrue(isogram.isIsogram("Demo"));
        assertFalse(isogram.isIsogram("DeOmo"));
    }
}
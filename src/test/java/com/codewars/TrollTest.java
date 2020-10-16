package com.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrollTest {


    @Test
    public void testDisemvowel() {
        String actual = Troll.disemvowel("Hello World");
        assertEquals("Hll Wrld", actual);
    }

}
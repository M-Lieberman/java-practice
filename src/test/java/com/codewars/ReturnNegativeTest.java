package com.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReturnNegativeTest {

    @Test
    void makeNegative() {
        assertEquals(-42, ReturnNegative.makeNegative(-42));
    }
}
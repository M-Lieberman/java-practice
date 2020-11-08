package com.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WarnTheSheepTest {
    @Test
    public void testWarnTheSheep() {
        assertEquals("Oi! Sheep number 2! You are about to be eaten by a wolf!", WarnTheSheep.warnTheSheep(new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 5! You are about to be eaten by a wolf!", WarnTheSheep.warnTheSheep(new String[]{"sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 6! You are about to be eaten by a wolf!", WarnTheSheep.warnTheSheep(new String[]{"wolf", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 1! You are about to be eaten by a wolf!", WarnTheSheep.warnTheSheep(new String[]{"sheep", "wolf", "sheep"}));
        assertEquals("Pls go away and stop eating my sheep", WarnTheSheep.warnTheSheep(new String[]{"sheep", "sheep", "wolf"}));
    }

    @Test
    public void testWarnTheSheepArrayList() {
        assertEquals("Oi! Sheep number 2! You are about to be eaten by a wolf!", WarnTheSheep.warnTheSheepArrayList(new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 5! You are about to be eaten by a wolf!", WarnTheSheep.warnTheSheepArrayList(new String[]{"sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 6! You are about to be eaten by a wolf!", WarnTheSheep.warnTheSheepArrayList(new String[]{"wolf", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 1! You are about to be eaten by a wolf!", WarnTheSheep.warnTheSheepArrayList(new String[]{"sheep", "wolf", "sheep"}));
        assertEquals("Pls go away and stop eating my sheep", WarnTheSheep.warnTheSheepArrayList(new String[]{"sheep", "sheep", "wolf"}));
    }
}


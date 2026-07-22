package com.github.bazoocaze.lib2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class App2Test {

    @Test
    void testGetFullAnswer() {
        assertEquals("42 is the answer", App2.getFullAnswer());
    }
}
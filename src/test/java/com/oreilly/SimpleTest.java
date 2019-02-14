package com.oreilly;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {
    @Test
    void firstTest() {
        assertEquals(2, 1 + 1);
    }

    @Test @Disabled("deliberately disabled")
    void failureWithAStringMessage() {
        int x = 2;
        int y = 3;
        assertEquals(5, x + y, "Sum should have been 5");
    }
}

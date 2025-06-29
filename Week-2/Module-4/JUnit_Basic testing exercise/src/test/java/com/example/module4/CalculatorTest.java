package com.example.module4;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testAdd() {
        assertEquals(5, 2 + 3);
    }

    @Test
    public void testSubtract() {
        assertEquals(1, 3 - 2);
    }

    @Test
    public void testMultiply() {
        assertEquals(6, 2 * 3);
    }

    @Test
    public void testDivide() {
        assertEquals(2, 6 / 3);
    }
}

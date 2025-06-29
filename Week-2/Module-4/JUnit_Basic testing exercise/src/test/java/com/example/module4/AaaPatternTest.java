package com.example.module4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AaaPatternTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup before test");
    }

    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown after test");
    }

    @Test
    public void testMultiply() {

        int result = calculator.multiply(3, 4);
        assertEquals(12, result);
    }

    @Test
    public void testDivision() {
        int result = calculator.divide(10, 2);
        assertEquals(5, result);
    }
}

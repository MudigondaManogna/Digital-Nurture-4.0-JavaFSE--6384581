package com.example;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    // Setup method - runs before EACH test
    @Before
    public void setUp() {
        System.out.println("Setting up Calculator");
        calculator = new Calculator(); // Arrange
    }

    // Teardown method - runs after EACH test
    @After
    public void tearDown() {
        System.out.println("Tearing down Calculator");
        calculator = null;
    }

    @Test
    public void testAddition() {
        // Arrange - Done in setUp()

        // Act
        int result = calculator.add(2, 3);

        // Assert
        assertEquals(5, result);
    }

    @Test
    public void testSubtraction() {
        // Arrange - Done in setUp()

        // Act
        int result = calculator.subtract(5, 2);

        // Assert
        assertEquals(3, result);
    }
}

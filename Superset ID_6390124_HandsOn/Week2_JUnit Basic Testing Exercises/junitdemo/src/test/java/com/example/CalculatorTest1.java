package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest1 {

    private Calculator1 calculator;

    // Setup - runs before each test
    @Before
    public void setUp() {
        calculator = new Calculator1(); // Arrange
        System.out.println("Setup: New Calculator1 created");
    }

    // Teardown - runs after each test
    @After
    public void tearDown() {
        System.out.println("Teardown: Calculator1 test completed\n");
    }

    @Test
    public void testAdd() {
        // Act
        int result = calculator.add(10, 5);

        // Assert
        assertEquals(15, result);
    }

    @Test
    public void testSubtract() {
        // Act
        int result = calculator.subtract(10, 5);

        // Assert
        assertEquals(5, result);
    }
}

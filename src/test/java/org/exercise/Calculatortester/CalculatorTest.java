package org.exercise.Calculatortester;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void testAddNumber() {

        assertEquals(41f, Calculator.addNumber(25, 16), 0.0f);

        // Test con numeri negativi
        assertEquals(-7f, Calculator.addNumber(-5, -2), 0.0f);

        // Test con numeri positivo e negativo
        assertEquals(10f, Calculator.addNumber(15, -5), 0.0f);

        // Test con numeri decimali
        assertEquals(6.8f, Calculator.addNumber(3.3f, 3.5f), 0.001f);
    }

    @Test
    public void testSubtract() {
        // Test con numeri positivi
        assertEquals(10.0f, Calculator.substract(20, 10), 0.0f);

        // Test con numeri negativi
        assertEquals(-5.0f, Calculator.substract(-3, 2), 0.0f);

        // Test con numeri positivo e negativo
        assertEquals(8.0f, Calculator.substract(5, -3), 0.0f);

        // Test con numeri decimali
        assertEquals(1.5f, Calculator.substract(3.5f, 2.0f), 0.0f);
    }

    @Test
    public void testDivide() {
        assertEquals(2.0f, Calculator.divide(10, 5), 0.0f);

        // Test con numeri negativi
        assertEquals(-5.0f, Calculator.divide(10, -2), 0.0f);

        // Test con numeri decimali
        assertEquals(0.5f, Calculator.divide(1.0f, 2.0f), 0.0f);

    }

    @Test
    public void testDivideByZero() throws IllegalArgumentException {
        try {
            Calculator.divide(10, 0);
            fail("Impossibile dividere per 0!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testMultiply() {
        // Test con numeri positivi
        assertEquals(50.0f, Calculator.multiply(10, 5), 0.0f);

        // Test con numeri negativi
        assertEquals(-6.0f, Calculator.multiply(3, -2), 0.0f);

        // Test con numeri decimali
        assertEquals(6.6f, Calculator.multiply(3.3f, 2.0f), 0.001f);
    }
}
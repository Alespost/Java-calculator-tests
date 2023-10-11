package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        this.calculator = new Calculator();
    }

    @Test
    void add() {
        assertEquals(4.0, this.calculator.add(1.0,3.0));
        assertEquals(0.0, this.calculator.add(-1.5, 1.5));
    }

    @Test
    void multiply() {
        assertEquals(32.0, this.calculator.multiply(8.0, 4.0));
    }

    @Test
    void div() {
        assertEquals(0, this.calculator.div(0, 666));
        assertEquals(1, this.calculator.div(5, 5));
        assertEquals(-1, this.calculator.div(5, -5));
        assertEquals(-1, this.calculator.div(-5, 5));
        assertEquals(1, this.calculator.div(-5, -5));

        assertThrowsExactly(ArithmeticException.class, () -> this.calculator.div(42, 0));
        assertThrowsExactly(ArithmeticException.class, () -> this.calculator.div(0, 0));

    }
}
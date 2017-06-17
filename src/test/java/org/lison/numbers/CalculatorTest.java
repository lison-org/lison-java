package org.lison.numbers;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class CalculatorTest {
    @Test
    public void divideUp() {
        assertSame(0, Calculator.divideUp(0, 1));
        assertSame(1, Calculator.divideUp(1, 1));
        assertSame(2, Calculator.divideUp(2, 1));
        assertSame(0, Calculator.divideUp(0, 2));
        assertSame(1, Calculator.divideUp(1, 2));
        assertSame(1, Calculator.divideUp(2, 2));
        assertSame(2, Calculator.divideUp(3, 2));
        assertSame(2, Calculator.divideUp(4, 2));
        assertSame(0, Calculator.divideUp(0, 3));
        assertSame(1, Calculator.divideUp(1, 3));
        assertSame(1, Calculator.divideUp(2, 3));
        assertSame(1, Calculator.divideUp(3, 3));
        assertSame(2, Calculator.divideUp(4, 3));
        assertSame(2, Calculator.divideUp(5, 3));
        assertSame(2, Calculator.divideUp(6, 3));
        assertSame(0, Calculator.divideUp(0, 4));
        assertSame(1, Calculator.divideUp(1, 4));
        assertSame(1, Calculator.divideUp(2, 4));
        assertSame(1, Calculator.divideUp(3, 4));
        assertSame(1, Calculator.divideUp(4, 4));
        assertSame(2, Calculator.divideUp(5, 4));
        assertSame(2, Calculator.divideUp(6, 4));
        assertSame(2, Calculator.divideUp(7, 4));
        assertSame(2, Calculator.divideUp(8, 4));
    }
}

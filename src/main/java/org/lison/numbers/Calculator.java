package org.lison.numbers;

public interface Calculator {
    static int divideUp(int dividend, int divisor) {
        return (dividend + divisor - 1) / divisor;
    }
}

package org.lison.utils;

public interface NumUtils {
    static int divideUp(int dividend, int divisor) {
        return (dividend + divisor - 1) / divisor;
    }
}

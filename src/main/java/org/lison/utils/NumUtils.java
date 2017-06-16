package org.lison.utils;

public interface NumUtils {
    static int divUp(int dividend, int divisor) {
        return (dividend + divisor - 1) / divisor;
    }
}

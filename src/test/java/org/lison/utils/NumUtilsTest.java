package org.lison.utils;

import org.junit.Test;
import static org.junit.Assert.assertSame;

public class NumUtilsTest {
    @Test
    public void divideUp() {
        assertSame(0, NumUtils.divideUp(0, 1));
        assertSame(1, NumUtils.divideUp(1, 1));
        assertSame(2, NumUtils.divideUp(2, 1));
        assertSame(0, NumUtils.divideUp(0, 2));
        assertSame(1, NumUtils.divideUp(1, 2));
        assertSame(1, NumUtils.divideUp(2, 2));
        assertSame(2, NumUtils.divideUp(3, 2));
        assertSame(2, NumUtils.divideUp(4, 2));
        assertSame(0, NumUtils.divideUp(0, 3));
        assertSame(1, NumUtils.divideUp(1, 3));
        assertSame(1, NumUtils.divideUp(2, 3));
        assertSame(1, NumUtils.divideUp(3, 3));
        assertSame(2, NumUtils.divideUp(4, 3));
        assertSame(2, NumUtils.divideUp(5, 3));
        assertSame(2, NumUtils.divideUp(6, 3));
        assertSame(0, NumUtils.divideUp(0, 4));
        assertSame(1, NumUtils.divideUp(1, 4));
        assertSame(1, NumUtils.divideUp(2, 4));
        assertSame(1, NumUtils.divideUp(3, 4));
        assertSame(1, NumUtils.divideUp(4, 4));
        assertSame(2, NumUtils.divideUp(5, 4));
        assertSame(2, NumUtils.divideUp(6, 4));
        assertSame(2, NumUtils.divideUp(7, 4));
        assertSame(2, NumUtils.divideUp(8, 4));
    }
}

package org.lison.utils;

import org.junit.Test;
import static org.junit.Assert.assertSame;

public class NumUtilsTest {
    @Test
    public void divUp() {
        assertSame(0, NumUtils.divUp(0, 1));
        assertSame(1, NumUtils.divUp(1, 1));
        assertSame(2, NumUtils.divUp(2, 1));
        assertSame(0, NumUtils.divUp(0, 2));
        assertSame(1, NumUtils.divUp(1, 2));
        assertSame(1, NumUtils.divUp(2, 2));
        assertSame(2, NumUtils.divUp(3, 2));
        assertSame(2, NumUtils.divUp(4, 2));
        assertSame(0, NumUtils.divUp(0, 3));
        assertSame(1, NumUtils.divUp(1, 3));
        assertSame(1, NumUtils.divUp(2, 3));
        assertSame(1, NumUtils.divUp(3, 3));
        assertSame(2, NumUtils.divUp(4, 3));
        assertSame(2, NumUtils.divUp(5, 3));
        assertSame(2, NumUtils.divUp(6, 3));
        assertSame(0, NumUtils.divUp(0, 4));
        assertSame(1, NumUtils.divUp(1, 4));
        assertSame(1, NumUtils.divUp(2, 4));
        assertSame(1, NumUtils.divUp(3, 4));
        assertSame(1, NumUtils.divUp(4, 4));
        assertSame(2, NumUtils.divUp(5, 4));
        assertSame(2, NumUtils.divUp(6, 4));
        assertSame(2, NumUtils.divUp(7, 4));
        assertSame(2, NumUtils.divUp(8, 4));
    }
}

package com.bytelegend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SwapperTest {
    @Test
    public void test() {
        Point point = new Point(100, 200);
        Swapper.swap(point);
        Assertions.assertEquals("(200,100)", point.toString());
    }
}

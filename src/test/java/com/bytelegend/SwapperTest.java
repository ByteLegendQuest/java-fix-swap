package com.bytelegend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class SwapperTest {
    @Test
    public void test() {
        int x = new Random().nextInt(100);
        int y = new Random().nextInt(100);
        Point point = new Point(x, y);
        Swapper.swap(point);
        Assertions.assertEquals("(" + y + "," + x + ")", point.toString());
    }
}

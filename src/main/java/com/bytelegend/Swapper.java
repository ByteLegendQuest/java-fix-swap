package com.bytelegend;

public class Swapper {
    public static void swap(Point point) {
        swap(point.x, point.y);
    }

    public static void swap(int x, int y) {
        x = x + y;
        y = x - y;
        x = x - y;
    }
}

package com.bytelegend;

public class Swapper {
    public static void swap(Point point) {
        swap(point, point.x, point.y);
    }

    public static void swap(Point point, int x, int y) {
        point.x = y;
        point.y = x;
    }
}

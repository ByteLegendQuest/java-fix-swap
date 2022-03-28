package com.bytelegend;

public class Swapper {
    private static Point point;
    public static void swap(Point point) {
        this.point = point;
        swap(point.x, point.y);
    }

    public static void swap(int x, int y) {
       point.x = y;
       point.y = x;
    }
}

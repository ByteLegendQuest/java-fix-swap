package com.bytelegend;

public class Swapper {
    public static void swap(Point point) {
        point = swap(point.x, point.y);
    }

    public static Point swap(int x, int y) {
       return new Point(y, x);
    }
}

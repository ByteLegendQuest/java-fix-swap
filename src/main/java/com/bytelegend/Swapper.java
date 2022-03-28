package com.bytelegend;

public class Swapper {
     private static Point point1;
    public static void swap(Point point) {
        point1 = point;
        swap(point.x, point.y);
    }

    public static void swap(int x, int y) {
        point1.x = y;
        point1.y = x;
    }
}

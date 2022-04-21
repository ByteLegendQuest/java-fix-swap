package com.bytelegend;

public class Swapper {
    public static Point p;

    public static void swap(Point point) {
        p = point;
        swap(point.x, point.y);
    }

    public static void swap(int x, int y) {
        int temp = x;
        p.x = y;
        p.y = temp;
    }
}

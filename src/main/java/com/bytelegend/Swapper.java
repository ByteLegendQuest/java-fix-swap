package com.bytelegend;

public class Swapper {
    public static void swap(Point point) {
        swap(point.x, point.y);
    }

    public static void swap(Point x, Point y) {
        int temp = x.x;
        x.x = y.y;
        y.y = temp;
    }
}

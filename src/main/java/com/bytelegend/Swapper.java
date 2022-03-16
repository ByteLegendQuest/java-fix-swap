package com.bytelegend;

public class Swapper {
    public static void swap(Point point) {
        swap(point);
    }

    public static void swap(Point point) {
        point.x = point.y;
        point.y = point.x;
    }
}

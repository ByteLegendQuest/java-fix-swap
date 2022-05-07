package com.bytelegend;

public class Swapper {
    public static void swap(Point point) {
        swap(point);
    }

    public static void swap(point) {
        point.x = point.x + point.y;
        point.y = point.x - point.y;
        point.x = point.x = point.y;
    }
}

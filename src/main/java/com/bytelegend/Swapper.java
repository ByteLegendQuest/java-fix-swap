package com.bytelegend;

public class Swapper {
    public static void swap(Point point) {
        swap(point);
    }

    private static void swap1(Point point) {
        int temp = point.x;
        point.x = point.y;
        point.y = temp;
    }
}

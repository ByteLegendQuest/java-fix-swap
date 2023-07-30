package com.bytelegend;

public class Swapper {
    public static void swap(Point point) {
        swapin(point);
    }

    public static void swapin(Point point) {
        int temp = point.x;
        point.x = point.y;
        point.y = temp;
    }
}

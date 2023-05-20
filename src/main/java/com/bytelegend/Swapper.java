package com.bytelegend;

public class Swapper {
    public static void swap(Point point) {
        point = new Point(point.y, point.x);
    }

    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }
}

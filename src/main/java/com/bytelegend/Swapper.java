package com.bytelegend;

public class Swapper {
    public static void swap(Point point) {
        point = Point(swap(point.x, point.y));
    }

    public static int swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        return x, y;
    }
}

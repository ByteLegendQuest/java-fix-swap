package com.bytelegend;

public class Swapper {
    static Point points;
    public static void swap(Point point) {
        points = point;
        swap(point.x, point.y);
    }

    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        points.x = y;
        points.y = temp;
    }
}

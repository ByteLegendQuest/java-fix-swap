package com.bytelegend;

public class Swapper {
    Point point;
    public static void swap(Point point) {
        this.point = point;
        swap(point.x, point.y);
    }

    public static void swap(int x, int y) {
        int temp = x;
        point.x = y;
        point.y = temp;
    }
}

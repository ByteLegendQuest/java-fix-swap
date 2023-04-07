package com.bytelegend;

public class Swapper {
    public static void swap(Point point) {
        swap(point.x, point.y, point);
    }

    public static void swap(int x, int y, Point p) {
        int temp = p.x;
        p.x = p.y;
        p.y = temp;
    }
}

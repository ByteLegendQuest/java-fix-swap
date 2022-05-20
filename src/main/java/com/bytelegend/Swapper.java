package com.bytelegend;

public class Swapper {
    public static void swap(Point point) {
        swap(point, point);
    }

    public static void swap(Point pointx, Point pointy) {
        int temp = pointx.x;
        pointx.x = pointx.y;
        pointx.y = temp;
    }
}

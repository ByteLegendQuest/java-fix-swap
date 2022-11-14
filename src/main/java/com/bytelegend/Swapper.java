package com.bytelegend;

public class Swapper {

    public static void swap(Point point) {
        Point point1 = new Point(swap(point.x,point.y));
        point = point1;
    }

    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }
}

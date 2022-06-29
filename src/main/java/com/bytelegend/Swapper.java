package com.bytelegend;

public class Swapper {
    public static void swap(Point point) {
        Point p2 = swap(point.x, point.y);
        point.x = p2.x;
        point.y = p2.y;
    }

    public static Point swap(int x, int y) {
        int temp = x;
        x=y;
        y=temp;
        Point p = new Point(x,y);
        return p;
    }
}
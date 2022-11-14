package com.bytelegend;

public class Swapper {
    public int a;
    public int b;

    public static void swap(Point point) {
        swap(point.x,point.y);
        Point point1 = new Point(a,b);
        point = point1;
    }

    public static void swap(int x, int y) {
        b = x;
        a = y;
    }
}

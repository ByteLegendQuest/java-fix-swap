package com.bytelegend;

public class Swapper {
    public int x;
    public int y;

    public static void swap(Point point) {
        swap(point.x,point.y);
        point.x = x;
        point.y = y;
    }

    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }
}

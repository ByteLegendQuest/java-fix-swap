package com.bytelegend;

public class Swapper {


    public static Point swap(Point point) {
        return swap(point.x,point.y);
    }

    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = x;
    }
}

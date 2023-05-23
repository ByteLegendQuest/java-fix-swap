package com.bytelegend;

public class Swapper {
    public static void swap(Point point) {
        swapP(point);
    }

    public static void swapP(Point p) {
        int temp = p.x;
        p.x = p.y;
        p.y = temp;
    }
}

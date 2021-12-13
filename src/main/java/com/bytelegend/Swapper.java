package com.bytelegend;

public class Swapper {
    public static void swap(Point p) {
       p.x=200;
       p.y=100;
    }

    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }
}

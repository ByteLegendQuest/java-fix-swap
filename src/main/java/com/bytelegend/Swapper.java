package com.bytelegend;

public class Swapper {
    public static void swap(Point point) {
        swap1(point.x, point.y);
    }

    public static void swap1(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }
}

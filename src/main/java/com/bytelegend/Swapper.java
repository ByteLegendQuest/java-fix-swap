package com.bytelegend;

public class Swapper {
    public static void swap(Point ...point) {
        int temp = point[0].x;
        point[0].x = point[0].y;
        point[0].y = temp;
    }

    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }
}

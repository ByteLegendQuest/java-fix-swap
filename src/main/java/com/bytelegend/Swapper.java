package com.bytelegend;

public class Swapper {
    public static void swap(Point point) {
        int temp = point.x;
        point.x = point.y;
        point.y = temp;
    }

    // public static void swap(int x, int y) {
    //     int temp = x;
    //     x = y;
    //     y = temp;
    // }
}

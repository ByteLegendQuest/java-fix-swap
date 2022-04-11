package com.bytelegend;

public class Swapper {
    public static void swap(Point point) {
        int temp = point.y;
        point.y = point.x;
        point.x = temp;
    }
}

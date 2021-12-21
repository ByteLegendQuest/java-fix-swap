package com.bytelegend;

public class Swapper {
    public static void swap(Point point) {
        swap(point.x, point.y);
    }

    public static void swap(Integer x, Integer y) {
        Integer temp = x;
        x = y;
        y = temp;
    }
}

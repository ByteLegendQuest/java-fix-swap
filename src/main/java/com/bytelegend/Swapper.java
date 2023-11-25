package com.bytelegend;

public class Swapper {
    public static void swap(Point point) {
        int z = point.x;
        point.x = point.y;
        point.y = z;
    }
}

package com.bytelegend;

public class Swapper {
    public static void swap(Point point) {
       int x = point.y;
       point.y = point.x;
       point.x = x;
    }
}

package com.bytelegend;

public class Swapper {
    public static void swap(Point point) {
        int tmp = point.x;
        point.x = point.y;
        point.y = tmp;
    }


}

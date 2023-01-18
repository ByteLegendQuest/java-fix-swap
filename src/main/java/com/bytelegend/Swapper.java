package com.bytelegend;


public class Swapper {

    public static Point swap(Point point) {
        int temp = point.x;
        point.x = point.y;
        point.y = temp;
        return point;
    }
}

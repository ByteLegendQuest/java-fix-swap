package com.bytelegend;

public class Swapper {
    public  static void swap(Point point)
    {
        int temp = point.x;
        point.x = point.y;
        point.y = temp;
    }

//    public static void swap(Point x, Point) {
//        int temp = x;
//        x = y;
//        y = temp;
//    }
}

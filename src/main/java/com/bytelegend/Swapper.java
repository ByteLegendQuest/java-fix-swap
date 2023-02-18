package com.bytelegend;

public class Swapper {
    public static void swap(Point point) {        
        swap(point.x, point.y);
        int[] xy = { point.x, point.y };
        swap(xy);
        point.x = xy[0];
        point.y = xy[1];
    }

    public static void swap(int[] xy) {        
        int temp = xy[0];
        xy[0] = xy[1];
        xy[1] = temp;
    }
}

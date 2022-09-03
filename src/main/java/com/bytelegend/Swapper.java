package com.bytelegend;

public class Swapper {
    public static void swap(Point point) {
        int []a=new int[2];
        a[0]=point.x;
        a[1]=point.y;
        swap(a);
    }

    public static void swap(int[]a) {
        int temp = a[0];
        a[0] = a[1];
        a[1] = temp;
    }
}

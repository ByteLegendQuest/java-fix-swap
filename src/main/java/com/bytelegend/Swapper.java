package com.bytelegend;

public class Swapper {
    private int x;
    private int y;
    public static void swap(Point point) {
        int temp =point.x;
        point.x = point.y;
        point.y = temp;
        swap(point.x, point.y);
    }

    public static void swap(int x, int y) {
        Swapper swapper = new Swapper();
        swapper.x = y;
        swapper.y = x;

    }
}

package com.bytelegend;

public class Swapper {
    public static void swap(Point point) {
        swap(point.x, point.y);
    }

    public static void swap(int sourceValue, int toSwapValue) {
        int temp = sourceValue;
        sourceValue = toSwapValue;
        toSwapValue = temp;
    }
}

package com.bytelegend;

public class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public static void main(String[] args) {
        Point point = new Point(1, 2);
        System.out.println("Before: " + point);
        Swapper.swap(point);
        System.out.println("After: " + point);
    }
}

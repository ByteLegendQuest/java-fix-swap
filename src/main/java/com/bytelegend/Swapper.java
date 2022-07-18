package com.bytelegend;

public class Swapper {
    public static void swap(Point point) {
      int t = point.x;
      point.x = point.y;
      point.y = t;
    }

    //public static void swap(int x, int y) {
      //  int temp = x;
        //x = y;
        //y = temp;
    //}
}


public class Swapper {
    public static void swap(Point point) {
        swap(point.x, point.y, point);
    }
    public static void swap(int x, int y, Point point) {
        int temp = x;
        point.x = y;
        point.y = temp;
    }
}
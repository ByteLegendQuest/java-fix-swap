public class Swapper {
    public static void swap(Point point) {
        int tmp = point.x;
        point.x = point.y;
        point.y = tmp;
        swap(point.x, point.y);
    }

    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }
}
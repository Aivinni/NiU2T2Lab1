public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point(int coordinates) {
        x = coordinates;
        y = coordinates;
    }

    public Point() {
        x = 0;
        y = 0;
    }
}

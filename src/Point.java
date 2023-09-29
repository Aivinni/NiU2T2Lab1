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

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String coordinate() {
        return ("(" + x + "," + y + ")");
    }

    public String quadrant() {
        if (x > 0 && y > 0) {
            return "I";
        } else if (x < 0 && y > 0) {
            return "II";
        } else if (x < 0 && y < 0) {
            return "III";
        } else if (x > 0 && y < 0) {
            return "IV";
        } else if (x == 0 && y == 0) {
            return "Origin";
        } else if (x == 0) {
            return "On y-axis";
        } else if (y == 0) {
            return "On y-axis";
        }
        return null;
    }
}

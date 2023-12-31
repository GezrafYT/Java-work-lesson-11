import java.util.Scanner;

public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }


    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(Point other)
    {
        double distance = Math.sqrt(Math.pow((this.x - other.x), 2) + Math.pow((this.y - other.y), 2));
        return distance;
    }

    public static boolean equal(Point p1, Point p2) {
        if (p1.x == p2.x && p1.y == p2.y) {
            return true;
        }
        return false;
    }
}


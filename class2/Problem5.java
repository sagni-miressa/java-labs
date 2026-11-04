package class2;

class Point2D {
    double x;
    double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

public class Problem5 {
    public static void swapCoords(Point2D p, Point2D q) {
        double tempX = p.x;
        double tempY = p.y;

        p.x = q.x;
        p.y = q.y;

        q.x = tempX;
        q.y = tempY;
    }

    public static void main(String[] args) {
        Point2D p1 = new Point2D(1, 2);
        Point2D p2 = new Point2D(5, 6);

        swapCoords(p1, p2);

        System.out.println("p1: (" + p1.x + ", " + p1.y + ")");
        System.out.println("p2: (" + p2.x + ", " + p2.y + ")");
    }
}
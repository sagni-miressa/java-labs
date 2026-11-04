package class2c;

class Circle {
    public static final double PI = 3.141592653589793;
    private static int count = 0;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public double getArea() {
        return PI * radius * radius;
    }
}

public class PracticeC_Task2 {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.5);
        Circle c2 = new Circle(3.0);
        Circle c3 = new Circle(5.0);
        Circle c4 = new Circle(1.0);

        System.out.println("Total Circles Created: " + Circle.getCount());
    }
}
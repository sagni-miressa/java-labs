package class2;

class Car {
    private String brand;
    private int speed;

    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = Math.max(0, speed);
    }

    public void accelerate(int amount) {
        if (amount > 0) {
            this.speed += amount;
        }
    }

    public void brake(int amount) {
        if (amount > 0) {
            this.speed = Math.max(0, this.speed - amount);
        }
    }

    public void display() {
        System.out.println("Brand: " + brand + " | Speed: " + speed + " km/h");
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 60);
        Car car2 = new Car("Tesla", 100);

        car1.accelerate(20);
        car1.brake(90);

        car2.brake(30);

        car1.display();
        car2.display();
    }
}
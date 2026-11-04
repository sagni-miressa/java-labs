package class2;

class Patient {
    private String name;
    private int age;
    private double weight;

    public Patient(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void show() {
        System.out.println("Patient Name: " + name + ", Age: " + age + ", Weight: " + weight + " kg");
    }
}

public class Problem2 {
    public static void main(String[] args) {
        Patient p1 = new Patient("Abebe", 35, 72.5);
        Patient p2 = new Patient("Kebede", 28, 65.0);

        p1.show();
        p2.show();
    }
}
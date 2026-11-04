package class2;

class Dog {
    String name;
}

public class Problem3 {
    public static void main(String[] args) {
        Dog a = new Dog();
        Dog b = a;
        Dog c = new Dog();

        b.name = "X";

        System.out.println("Objects created: 2");
        System.out.println("a.name: " + a.name);
        System.out.println("c.name: " + c.name);
    }
}
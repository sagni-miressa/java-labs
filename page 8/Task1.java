import java.util.Scanner;

public class Task1 { // Ensure this file is saved as Task1.java
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first double: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second double: ");
        double num2 = input.nextDouble();

        System.out.println("Product: " + (num1 * num2));
        System.out.println("Quotient: " + (num1 / num2));

        input.close();
    }
}
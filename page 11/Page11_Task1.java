import java.util.Scanner;

public class Page11_Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        
        double squareRoot = Math.sqrt(num);
        double cube = Math.pow(num, 3);
        long rounded = Math.round(num);
        
        System.out.println("Square Root: " + squareRoot);
        System.out.println("Cube: " + cube);
        System.out.println("Rounded: " + rounded);
        
        scanner.close();
    }
}
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = input.next();
        
        System.out.print("Enter your birth year: ");
        int birthYear = input.nextInt();
        
        int age = 2026 - birthYear;
        System.out.println("Hello " + name + ", you are about " + age);
        
        input.close();
    }
}
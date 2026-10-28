package page17;

import java.util.Scanner;

public class Page17_Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine().toLowerCase();

        int vowelCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
        scanner.close();
    }
}
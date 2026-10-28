package page19;

import java.util.Random;
import java.util.Scanner;

public class Page19_Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int targetNumber = random.nextInt(100) + 1; // 1 to 100
        int attempts = 0;
        int guess = 0;

        System.out.println("Guess a number between 1 and 100:");

        while (guess != targetNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
            }
        }

        scanner.close();
    }
}
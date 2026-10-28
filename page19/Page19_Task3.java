package page19;

import java.util.ArrayList;
import java.util.Scanner;

public class Page19_Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        ArrayList<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        System.out.println("Prime numbers up to " + n + ": " + primes);
        scanner.close();
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
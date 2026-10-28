package page17;

import java.util.Scanner;

public class Page17_Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[8];
        int sum = 0;

        System.out.println("Enter 8 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        double average = (double) sum / arr.length;
        int countAbove = 0;

        for (int num : arr) {
            if (num > average) {
                countAbove++;
            }
        }

        System.out.println("Average: " + average);
        System.out.println("Count of elements above average: " + countAbove);

        scanner.close();
    }
}
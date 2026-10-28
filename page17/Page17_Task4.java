package page17;

import java.util.Scanner;

public class Page17_Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {12, 45, 67, 23, 89, 34, 90, 11};

        System.out.print("Enter target value to search: ");
        int target = scanner.nextInt();

        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break; // Stop at first occurrence
            }
        }

        System.out.println("Index of target (" + target + "): " + index);
        scanner.close();
    }
}
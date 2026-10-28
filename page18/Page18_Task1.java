package page18;

import java.util.ArrayList;
import java.util.Scanner;

public class Page18_Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextInt());
        }

        int sum = 0;
        for (int num : list) {
            sum += num;
        }

        System.out.println("Sum of elements: " + sum);
        scanner.close();
    }
}
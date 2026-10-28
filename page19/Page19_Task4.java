package page19;

import java.util.ArrayList;
import java.util.Scanner;

public class Page19_Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<>();
        boolean running = true;

        while (running) {
            System.out.println("\n--- Shopping List Menu ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Print List");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item to add: ");
                    String addItem = scanner.nextLine();
                    shoppingList.add(addItem);
                    System.out.println("'" + addItem + "' added.");
                    break;
                case 2:
                    System.out.print("Enter item to remove: ");
                    String removeItem = scanner.nextLine();
                    if (shoppingList.remove(removeItem)) {
                        System.out.println("'" + removeItem + "' removed.");
                    } else {
                        System.out.println("Item not found in list.");
                    }
                    break;
                case 3:
                    System.out.println("Current Shopping List: " + shoppingList);
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting Shopping List program.");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }
}
package page18;

import java.util.ArrayList;
import java.util.Scanner;

public class Page18_Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Enter names (type 'end' to stop):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }
            names.add(input);
        }

        System.out.println("\nTotal names entered: " + names.size());
        System.out.println("Names in reverse order:");
        for (int i = names.size() - 1; i >= 0; i--) {
            System.out.println(names.get(i));
        }

        scanner.close();
    }
}
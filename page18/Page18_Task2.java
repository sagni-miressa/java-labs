package page18;

import java.util.ArrayList;

public class Page18_Task2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("Original list: " + names);

        // Add to front (index 0) and end
        names.add(0, "First_Name");
        names.add("Last_Name");

        System.out.println("After adding at front and end: " + names);

        // Remove middle element
        int middleIndex = names.size() / 2;
        names.remove(middleIndex);

        System.out.println("After removing middle element: " + names);
    }
}
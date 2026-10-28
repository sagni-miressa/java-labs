package page18;

import java.util.ArrayList;

public class Page18_Task5 {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Apple");
        items.add("Orange");
        items.add("Banana");

        System.out.println("Original list: " + items);

        ArrayList<String> uniqueItems = new ArrayList<>();
        for (String item : items) {
            if (!uniqueItems.contains(item)) {
                uniqueItems.add(item);
            }
        }

        System.out.println("List with duplicates removed: " + uniqueItems);
    }
}
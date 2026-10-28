package page18;

import java.util.ArrayList;

public class Page18_Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(8);
        numbers.add(10);
        numbers.add(11);

        System.out.println("Original list: " + numbers);

        // Iterate backwards so removing items doesn't shift upcoming indices
        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
            }
        }

        System.out.println("List after removing even numbers: " + numbers);
    }
}
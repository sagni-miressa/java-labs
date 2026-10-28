package page11;

import java.util.Random;

public class Page11_Task5 {
    public static void main(String[] args) {
        Random r = new Random();
        int totalSum = 0;
        int rolls = 1000;
        
        for (int i = 0; i < rolls; i++) {
            int die = r.nextInt(6) + 1;
            totalSum += die;
        }
        
        double average = (double) totalSum / rolls;
        
        System.out.println("Total sum of 1000 rolls: " + totalSum);
        System.out.println("Average roll value: " + average);
        System.out.println("Difference from 3.5: " + Math.abs(average - 3.5));
    }
}
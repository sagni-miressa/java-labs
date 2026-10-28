package page11;

import java.util.Random;

public class Page11_Task4 {
    public static void main(String[] args) {
        Random r = new Random();
        
        for (int i = 1; i <= 10; i++) {
            int die1 = r.nextInt(6) + 1;
            int die2 = r.nextInt(6) + 1;
            int sum = die1 + die2;
            
            System.out.println("Roll " + i + ": Die 1 = " + die1 + ", Die 2 = " + die2 + " | Sum = " + sum);
        }
    }
}
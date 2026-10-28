package page11;

import java.util.Random;

public class Page11_Task2 {
    public static void main(String[] args) {
        Random r = new Random();
        
        // Range 1000..9999
        int pin = r.nextInt(9000) + 1000;
        
        System.out.println("Random 4-digit PIN: " + pin);
    }
}
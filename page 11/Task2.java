import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random r = new Random();
        
        int pin = r.nextInt(9000) + 1000;
        
        System.out.println("Random 4-digit PIN: " + pin);
    }
}
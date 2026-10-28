import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter integer n: ");
        int n = input.nextInt();
        input.nextLine(); // Consumes leftover newline character from nextInt()
        
        System.out.print("Enter a full sentence: ");
        String sentence = input.nextLine();
        
        for (int i = 0; i < n; i++) {
            System.out.println(sentence);
        }
        
        input.close();
    }
}
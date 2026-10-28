package page17;

import java.util.Random;

public class Page17_Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matrix = new int[3][3];

        // Fill matrix with random single digits (0-9) and print it
        System.out.println("3x3 Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = random.nextInt(10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Row sums
        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            for (int j = 0; j < 3; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Sum of Row " + (i + 1) + ": " + rowSum);
        }

        // Column sums
        for (int j = 0; j < 3; j++) {
            int colSum = 0;
            for (int i = 0; i < 3; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Sum of Column " + (j + 1) + ": " + colSum);
        }
    }
}
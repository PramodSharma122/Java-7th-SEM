
// WAP to store 2x2 matrix then display that matrix.
// date: 2025-04-29
import java.util.Scanner;

public class MatrixDisplay {
    public static void main(String[] args) {
        int[][] matrix = new int[2][2];
        int i, j;
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.println("Enter number: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println("The matrix is: ");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

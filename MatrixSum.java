// WAP to display the sum of all elements of a 2x2 matrix.
// date: 2025-04-30

import java.util.Scanner;
public class MatrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] num1 = new int[2][2];
        int[][] num2 = new int[2][2];
        int[][] sum = new int[2][2];
        int i, j;
        System.out.println("Enter elements of first matrix: ");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                num1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix: ");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                num2[i][j] = sc.nextInt();
            }
        }
        System.out.println("The sum of the two matrices is: ");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                sum[i][j] = num1[i][j] + num2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}

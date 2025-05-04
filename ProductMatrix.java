// This program multiplies two 2x2 matrices entered by the user and prints the product matrix.
// date: 2025-04-30
import java.util.Scanner;
public class ProductMatrix {
    public static void main(String[] args) {
        int[][] num1 = new int[2][2];
        int[][] num2 = new int[2][2];
        int[][] product = new int[2][2];
        int i, j, k;
        Scanner sc = new Scanner(System.in);
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
        System.out.println("The product of the two matrices is: ");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                product[i][j] = 0;
                for (k = 0; k < 2; k++) {
                    product[i][j] += num1[i][k] * num2[k][j];
                }
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}

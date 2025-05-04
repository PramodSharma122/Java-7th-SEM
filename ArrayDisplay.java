
// WAP to store 10 numbers in an array then display those numbers.
// date: 2025-04-29
import java.util.Scanner;

public class ArrayDisplay {
    public static void main(String[] args) {
        int[] num = new int[10];
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println("Enter number: ");
            Scanner sc = new Scanner(System.in);
            num[i] = sc.nextInt();
            sc.close();
        }
        System.out.println("The numbers are: ");
        for (i = 0; i < 10; i++) {
            System.out.println(num[i] + " ");
        }
    }
}

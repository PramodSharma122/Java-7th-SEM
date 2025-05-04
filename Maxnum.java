
// WAP to store 10 numbers in an array then display Largest number.
// date: 2025-04-29
import java.util.Scanner;

public class Maxnum {
    public static void main(String[] args) {
        int[] num = new int[10];
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println("Enter number: ");
            Scanner sc = new Scanner(System.in);
            num[i] = sc.nextInt();
            sc.close();
        }
        int max = num[0];
        for (i = 1; i < 10; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("The maximum number is: " + max);

    }
}

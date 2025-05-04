
// WAP to display the elements of an array in Descending order.
// date: 2025-04-29
import java.util.Scanner;

public class Descending {
    public static void main(String[] args) {
        int[] num = new int[10];
        int i, j, temp;
        for (i = 0; i < 10; i++) {
            System.out.println("Enter number: ");
            Scanner sc = new Scanner(System.in);
            num[i] = sc.nextInt();
            sc.close();
        }
        for (i = 0; i < 10; i++) {
            for (j = i + 1; j < 10; j++) {
                if (num[i] < num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println("The numbers in descending order are: ");
        for (i = 0; i < 10; i++) {
            System.out.print(num[i] + " ");
        }
    }

}

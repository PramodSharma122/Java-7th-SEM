
// Project: Palindrome
// File Created: 2025-04-28
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int n, r, rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        int temp = n;
        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        if (temp == rev) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
        sc.close();
    }
}

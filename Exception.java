// This program demonstrates the use of try-catch blocks in Java to handle exceptions.
// Date: 2025-05-08

import java.lang.*;

public class Exception {
    public static void main(String args[]) {
        try {
            int d, a;
            d = 4;
            a = 42 / d;
            System.out.println("This will not be printed");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
        System.out.println("After catch statements");
    }
}

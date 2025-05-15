// WAP to demonstrate multiple exceptions handling in Java
//Date: 2025-05-13

import java.io.*;

public class Excepmulti{
    public static void main(String args[]){
        try{
            int arr[];
            arr = new int[5];
            arr[0] = 10;
            arr[1] = 20;
            arr[2] = 30;
            arr[3] = 40;
            arr[4] = 50;
            int i;

            int d,a;
            d = 10;
            a = 42/d;
            System.out.println("Division is: " + a);
            for(i=0; i<=5; i++){
                System.out.println("Value at index " + i + " is: " + arr[i]);
            }
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero ");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception: " + e);
        }
        System.out.println("After catch statement...");
    }
}
// WAP to Console input in Java
// Date: 2025-05-15

import java.io.*;
class Consoleinput{
    public static void main(String[] args) throws IOException{
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        String str[]=new String[100];

        System.out.println("Enter lines of text.");
        System.out.println("Enter 'stop' to quit.");

        for(int i=0;i<100;i++){
            str[i]=br.readLine();
            if(str[i].equals("stop"))
                break;
        }

        System.out.println("\nHere is your file: ");
        for(int i=0;i<100;i++){
            if(str[i].equals("stop"))
                break;
            System.out.println(str[i]);
        }
    }
}
// WAP to synchronize a method in Java
// Date: 2025-05-15

import java.io.IOException;

class Table extends Thread{
    int n;
    public Table(int n){
        this.n = n;
    }
    synchronized void printTable(){
        for(int i=1; i<=5; i++){
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            } catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
    public void run(){
        printTable();
    }
}

public class TestSynchronization{
    public static void main(String[] args) throws IOException{
        Table obj = new Table(5);
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        t1.start();
        t2.start();
    }
}

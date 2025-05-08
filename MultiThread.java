// WAP to create a thread using Thread class and implement run method to print the name of the thread and the iteration number. Use sleep method to pause the thread for 1 second after each iteration. Create three threads and start them.
// Date: 2025-05-08

import java.lang.*;

class MultiThread extends Thread {
    String threadname;

    MultiThread(String name) {
        threadname = name;
    }

    public void run() {
        try {
            System.out.println(threadname + " is running");
            for (int i = 0; i < 5; i++) {
                System.out.println(i + " is executing iteration " + threadname);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(threadname + " is interrupted");
        }
    }

    public static void main(String args[]) {
        MultiThread t1 = new MultiThread("CCT");
        MultiThread t2 = new MultiThread("College");
        MultiThread t3 = new MultiThread("BH-12");
        t1.start();
        t2.start();
        t3.start();
    }

}

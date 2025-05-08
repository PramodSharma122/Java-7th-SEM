// Java program to demonstrate the use of threads
// Date: 2025-05-08

class Threada implements Runnable {
    public void run() {
        for (int i = 50; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Even Number: " + i);
            }
        }
    }
}

class Threadb implements Runnable {
    public void run() {
        for (int i = 100; i <= 200; i++) {
            if (i % 2 == 1) {
                System.out.println("Odd Number: " + i);
            }
        }
    }
}

class ThreadExam {
    public static void main(String args[]) {
        Runnable obj1 = new Threada();
        Thread t1 = new Thread(obj1);
        t1.start();

        Runnable obj2 = new Threadb();
        Thread t2 = new Thread(obj2);
        t2.start();
    }
}

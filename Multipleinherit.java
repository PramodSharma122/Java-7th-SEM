// WAP to demonstrate multiple inheritance in java using interfaces
// Date: 2025-05-06

interface A {
    public void greet();
}
interface B {
    public void learn();
}
class C implements A, B {
    public void greet() {
        System.out.println("Hello Students");
    }
    public void learn() {
        System.out.println("We are Learning Multiple Inheritance");
    }
}

public class Multipleinherit {
    public static void main(String args[]) {
        C obj = new C();
        obj.greet();
        obj.learn();
    }
}

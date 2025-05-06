// WAP to create a class named Access with a static variable x and a static method get() that returns the value of x plus 10. In the main method, create an object of the Access class and call the get() method twice, printing the results to the console.
// date: 2025-05-04
class App {
    static int x=10;
    public static int get(){
        return x+10;
    }
}

public class Access{
    public static void main(String[] args) {
        Access obj = new Access();
        System.out.println(obj.get());
        System.out.println(obj.get());
    }
}

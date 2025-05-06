// WAP to show multilevel inheritance in java 
// 2081-01-22

class person{
    int code;
    String name;
    void display(){
        System.out.println("code: "+code);
        System.out.println("Name: "+name);
    }
}

class staff extends person{
    String company;
    void display(){
        super.display();
        System.out.println("Company: "+company);
    }
    
}

class Manager extends staff{
    String department;
    void display(){
        super.display();
        System.out.println("Department: "+department);
    }
}

public class Multilevel{
    public static void main(String args[]){
        Manager m = new Manager();
        m.code = 10;
        m.name = "Pramod Sharma";
        m.company = "Tech Corp";
        m.department = "IT";
        m.display();
    }
}

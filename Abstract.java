// WAP to demonstrate abstract class in java.
// 2081-01-22

abstract class Geometry{
    abstract float area();
    void show(){
        System.out.println("This is a Geometry class.");
    }
}

class Circle extends Geometry{
    float r;
    Circle(float r){
        this.r = r;
    }
    float area(){
        return (float)(Math.PI * r * r);
    }
}

class Rectangle extends Geometry{
    float l,b;
    Rectangle(float l , float b){
        this.l=l;
        this.b=b;
    }
    float area(){
        return l*b;
    }
}

 class Abstract{
    public static void main(String args[]){
        Circle a = new Circle(5);
        Rectangle b = new Rectangle(4,5);
        a.show();
        b.show();

        System.out.println("Area of Circle: " + a.area());
        System.out.println("Area of Rectangle: " + b.area());
    }
}
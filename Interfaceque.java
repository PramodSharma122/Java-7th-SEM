// Wap to find area of rectangle and square using interface.
// Date: 2025-05-06

interface shape{
    public void get_data(int x, int y);
    public void display_area();
}
class Rectangle implements shape{
    int lenght,breadth,area;
    public void get_data(int x, int y){
        lenght=x;
        breadth=y;
    }
    public void display_area(){
        area=lenght*breadth;
        System.out.println("Area of Rectangle: "+area);
    }
}
class Square implements shape{
    int lenght,area;
    public void get_data(int x, int y){
        lenght=x;
    }
    public void display_area(){
        area=lenght*lenght;
        System.out.println("Area of Square: "+area);
    }
}
public class Interfaceque {
    public static void main(String args[]){
        Rectangle r = new Rectangle();
        r.get_data(5,10);
        r.display_area();
        
        Square s = new Square();
        s.get_data(5,0);
        s.display_area();
    }
}

// WAP to display the area of a circle using an interface in java
// Date: 2025-05-06
interface Math{
    float kpi=3.14f;
    float PI = 0;
    void area(float r);
}
public class mymath implements Math{
    public void area(float r){
        System.out.println(r*kpi);
    }
    public static void main(String args[]){
        float r=5;
        mymath ob = new mymath();
        ob.area(r);
    }
}

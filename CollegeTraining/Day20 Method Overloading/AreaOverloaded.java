// Create a class that has overloaded methods for displaying the area of different shapes.
class MultiArea {
    void area(int a){
        // Square
        System.out.println("Square : "+a*a);
    }
    void area(int a, int b){
        // rectangle
        System.out.println("Rectangle : "+a*b);
    }
    void area(double r){
        // circle
        System.out.println("Circle : "+3.14*r*r);
    }
    void area(double b,double h){
        // triangle
        System.out.println("Triangle : "+0.5*b*h);
    }
}
public class AreaOverloaded {
   public static void main(String[] args) {
    MultiArea mr = new MultiArea();
    mr.area(4);
    mr.area(4, 5);
    mr.area(3.5);
    mr.area(3.5,5.3);
   } 
}
/*
Square : 16
Rectangle : 20
Circle : 38.465
Triangle : 9.275
 */
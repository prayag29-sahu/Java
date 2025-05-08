abstract class Shape {
    abstract void area(double r);
}
class Circle extends Shape {
    void area(double r){
        System.out.println("Circle Area : "+ (3.14*r*r));
    }
}
class Rectangle extends Shape {
    void area(double r){
        double b=9.0;
        System.out.println("Rectangle Area : "+ (r*b));
    }
}
public class AbstractShap {
    public static void main(String[] args) {
        Shape S = new Circle();
        Shape S1 = new Rectangle();
        S.area(4.3);
        S1.area(2.3);

    }
}
/*
Circle Area : 58.0586
Rectangle Area : 20.7
 */
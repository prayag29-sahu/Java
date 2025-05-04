/*
 * 6. Create a class Circle with radius. Write methods to calculate area and circumference of the circle.
 */
class CircleRed{
    double r;

    public CircleRed(double radius) {
        r=radius;
    }
    void Area(){
        System.out.println("Area : "+ 3.14*r*r);
    }
    void Circum(){
        System.out.println("Circumference : "+ 2.0*3.14*r);
    }
    
}

public class Circle {
    public static void main(String[] args) {
        CircleRed c1 = new CircleRed(6.0);
        c1.Area();
        System.out.println();
        c1.Circum();
    }    
}

// Area : 113.03999999999999
// 
// Circumference : 37.68

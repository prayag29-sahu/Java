/*

✅ Question 10: Create a Program (Single-Level Inheritance)
Q: Write a Java program where:

Class Shape has method draw()

Class Circle inherits Shape and has method calculateArea()

Create an object of Circle and call both methods.

 */
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    void calculateArea() {
        System.out.println("Area of circle = r r");
    }
}

public class SingleLevelInher2 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        c.calculateArea();
    }

}
/*
 * Drawing a shape
 * Area of circle = r r
 */
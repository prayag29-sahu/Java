/*Create an abstract class Shape with an abstract method draw.

Create two classes Circle and Square that extend Shape and override the draw method to display the shape being drawn. */
class Shap {
    void draw(){

    }
}
class Circle extends Shap {
    void draw(){
        System.out.println("Draw Circle");
    }
}
class Square extends Shap {
    void draw(){
        System.out.println("Draw Square");
    }
}
public class ShapOverride {
    public static void main(String[] args) {
        Shap c = new Circle();
        c.draw();
        Shap s = new Square();
        s.draw();
    }
}
/*
Draw Circle
Draw Square
 */
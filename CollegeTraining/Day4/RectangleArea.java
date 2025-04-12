/*
 * Create a class named Rectangle with instance variables length and width. Inside the main
method calculate the area of the rectangle.
 */

public class RectangleArea {
    public static class Rectangle{
        int length, width;
    }
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.length = 10;
        rec.width = 20;
        System.out.println("The Area of Rectangle : "+ (rec.length*rec.width));
    }
}
// o/p (The Area of Rectangle : 200)
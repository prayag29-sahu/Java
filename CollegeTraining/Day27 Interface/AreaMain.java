/*
Q4. Create an interface Shape with a method area().
Then, create a class Circle that implements Shape and calculates the area using radius = 5.
Print the area in the main method.
 */
interface Shape{
    void area();
}
class Circle implements Shape{
    public void area(){
        float radius = 5;
        System.out.println("Radius of circle : "+ 3.14*5*5);
    }
}
public class AreaMain {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.area();
    }
}
// Radius of circle : 78.5
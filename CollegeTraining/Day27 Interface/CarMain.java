/*
Q5. Create an interface Vehicle with a default method start() that prints "Vehicle is starting...".
Create a class Car that implements Vehicle.
Call the default method from an object of Car in the main method.
 */
interface Vehicle {
    default void start(){
        System.out.println("Vehicle is Starting....");
    }
}
class Car implements Vehicle{
}
public class CarMain {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}
// Vehicle is Starting....
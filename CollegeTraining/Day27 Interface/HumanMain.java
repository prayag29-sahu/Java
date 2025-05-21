/*
Q1. Create two interfaces Walkable and Runnable.
Each should have a method: walk() and run() respectively.
Then, create a class Human that implements both interfaces and defines both methods.
Create a main method where an object of Human is created and both methods are called.
 */

interface Walkable{
    void walk();
    void run();
}
interface Runnable{
    void walk();
    void run();
}
class Human implements Walkable,Runnable{
    public void walk(){
        System.out.println("Human gernally walk");
    }
    public void run(){
        System.out.println("Human can also run");
    }
}
public class HumanMain {
    public static void main(String[] args) {
        Human h = new Human();
        h.walk();
        h.run();
    }
    
}
/*
Human gernally walk
Human can also run
 */
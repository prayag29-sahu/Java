/*
 * Create a class named Greeting inside the main method that declares a local variable name and
prints "Hello, [name]"
 */

public class Name {
    public static void main(String[] args) {
        class Greeting{
            String name = "Ram";
        }
        Greeting gt = new Greeting();
        System.out.println("Hello, "+gt.name);
    }
    
}
// o/p (Hello, Ram)
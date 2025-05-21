/*
Q3. Create an interface Animal with a method makeSound().
Then, create a class Dog that implements Animal and overrides makeSound() to print "Bark".
In the main method, use the interface reference to call the method from Dog
 */
interface Animal{
    void makeSound();
}
class Dog implements Animal{
    public void makeSound(){
        System.out.println("Bark");
    }
}
public class AnimalMain {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound(); 
    }    
}
// Bark
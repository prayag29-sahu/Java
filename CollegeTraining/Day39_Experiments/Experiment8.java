// Experiment 8
// Exp8: Create a class named ‘Animal’ which includes methods like eat() and sleep(). Create a
// child class of  Animal named ‘Bird’ and override the parent class methods
//  . Add a new method named fly(). Create an instance of Animal class and 
// invoke eat and sleep methods using this object. Create an instance of Bird class and 
// invoke eat, sleep and fly methods using this object.

class Animal {

    public void eat() {
        System.out.println("Animal Eating: I eat ... munch munch");
    }

    public void sleep() {
        System.out.println("Animal Sleeping: Zzzzzz");
    }
}

class Bird extends Animal {

    public void eat() {
        System.out.println("Bird Eating: I eat insects and grains");
    }

    public void sleep() {
        System.out.println("Bird Sleeping: Zzzzzzz");
    }

    public void fly() {
        System.out.println("Bird Flying: Swooooosh");
    }
}

public class Experiment8 {

    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println("Parent's Methods invoked....");
        a.eat();
        a.sleep();
        Bird b = new Bird();
        System.out.println("Child's Methods invoked....");
        b.eat();
        b.sleep();
        b.fly();
    }
}

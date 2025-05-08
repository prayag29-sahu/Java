abstract class Animal {
    abstract void Sound();
}
class Cat extends Animal {
    void Sound(){
        System.out.println("Cat Voice .......");
    }
}
class Dog extends Animal {
    void Sound(){
        System.out.println("Dog Voice .......");
    }
}

public class AbstactAnimal {
    public static void main(String[] args) {
        Animal A = new Cat();
        Animal A1 = new Dog();
        A.Sound();
        A1.Sound();
    }
}
/*
Cat Voice .......
Dog Voice .......
 */
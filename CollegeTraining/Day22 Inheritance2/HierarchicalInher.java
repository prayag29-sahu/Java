class Animal {
    void eat(){
        System.out.println("Eattttt....");
    }
}
class Dog extends Animal {
    void Bark(){
        System.out.println("Barkkk........");
    }
}
class Puppy extends Animal {
    void Cute(){
        System.out.println("Cute...........");
    }
}
public class HierarchicalInher {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.Bark();
        d.eat();
        Puppy p = new Puppy();
        p.Cute();
        p.eat();
    }
}
/*
Barkkk........
Eattttt....
Cute...........
Eattttt....
 */
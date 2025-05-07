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
class Puppy extends Dog {
    void Cute(){
        System.out.println("Cute...........");
    }
}
public class MultiLevelInher {
    public static void main(String[] args) {
        Puppy P = new Puppy();
        P.Cute();
        P.Bark();
        P.eat();
    }
}
/*
Cute...........
Barkkk........
Eattttt....
 */
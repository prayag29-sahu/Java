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
public class SingleLevelInher {
    public static void main(String[] args) {
        Dog D = new Dog();
        D.Bark();
        D.eat();
    }
}
/*
Barkkk........
Eattttt....
 */
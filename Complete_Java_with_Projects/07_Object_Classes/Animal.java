class Dog {

    public void Eat(){
        System.out.println("Eat Dog food.");
    }
    public void Sound(){
        System.out.println("Barking");
    }
}

public class Animal {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.Eat();
        d.Sound();
    }
}
/*
Eat Dog food.
Barking
 */
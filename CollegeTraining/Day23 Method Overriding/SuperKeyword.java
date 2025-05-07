/*
Write a simple program to demonstrate method overriding using classes Animal and Dog.
The Animal class should have a sound method (like "Animal makes sound"). The Dog class should override the sound method to print "Bark". Create an instance of Dog and call the sound method.

 */
class Animal {
    void Sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal {
    void Sound(){
        System.out.println("Bark......");
        super.Sound();
    }
}
class SuperKeyword {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.Sound();
    }
}
/*
Bark......
Animal makes sound
 */
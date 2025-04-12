/*
 * Create a class named Person with instance variables name and age. Inside the main method
display the name and age.
 */

public class PersonInfo {
    public static void main(String[] args) {
        class Person{
            String name = "Ram";
            int age = 25; 
        }
        Person cala = new Person();
        Person calb = new Person();

        System.out.println("Person Details = Name : "+cala.name+" and Age : "+calb.age );
    }
}
// o/p (Person Details = Name : Ram and Age : 25)
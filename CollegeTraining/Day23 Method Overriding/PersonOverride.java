/*

Create a Person class with a displayDetails method that prints basic details (name, age).

Create a Student class that overrides the displayDetails method to print additional details like grade and school name.
 */
class person {
    void displayDetails(String name,int age){
        System.out.println("Name : "+name+" And age : "+age);
    }
}
class student extends person {
    String grad = "A";
    String ScName = "Government H S School";
    void displayDetails(String name,int age){
        super.displayDetails(name,age);
        System.out.println("Grade : "+grad+" School Name : "+ScName);
    }
}
public class PersonOverride {
    public static void main(String[] args) {
        person p = new student();
        p.displayDetails("Roy", 14);
    }
    
}
/*
Name : Roy And age : 14
Grade : A School Name : Government H S School
 */
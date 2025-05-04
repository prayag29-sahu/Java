/*

✅ Question 9: Create a Program (Multi-Level Inheritance)
Q: Write a Java program where:

Class Person has method displayName()

Class Student inherits Person and adds method displayClass()

Class Monitor inherits Student and adds method checkDiscipline()

Create an object of Monitor and call all three methods.

 */
class Person {
    void displayName() {
        System.out.println("Name: Aryan");
    }
}

class Student extends Person {
    void displayClass() {
        System.out.println("Class: 12th");
    }
}

class Monitor extends Student {
    void checkDiscipline() {
        System.out.println("Monitor is checking discipline");
    }
}

public class MultiLevelInherit {
    public static void main(String[] args) {
        Monitor mon = new Monitor();
        mon.displayName();
        mon.displayClass();
        mon.checkDiscipline();
    }

}
/*
 * Name: Aryan
 * Class: 12th
 * Monitor is checking discipline
 */
/*
✅ Question 8: Create a Program (Single-Level Inheritance)
Q: Write a Java program where:

Class Employee has method work()

Class Manager inherits Employee and has method attendMeeting()

Create an object of Manager and call both methods
*/
class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}

class Manager extends Employee {
    void attendMeeting() {
        System.out.println("Manager is attending a meeting");
    }
}

public class SingleLevelInherit {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.work();
        m.attendMeeting();
    }
}
/*
Employee is working
Manager is attending a meeting
 */
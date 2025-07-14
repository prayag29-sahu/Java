class StudentDetails {
    String name;
    int age;
    String studentId;

    public StudentDetails(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentId);
    }
}
public class Student {
    public static void main(String[] args) {
        StudentDetails student1 = new StudentDetails("Alice", 20, "S001");
        StudentDetails student2 = new StudentDetails("Bob", 22, "S002");

        student1.displayDetails();
        student2.displayDetails();
    }
}
/*
Name: Alice
Age: 20
Student ID: S001
Name: Bob
Age: 22
Student ID: S002
 */

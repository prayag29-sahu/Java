
import java.util.*;

class Student implements Comparable<Student> {

    private int rollNo;
    private String name;
    private int age;

    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String toString() {
        return "Student{"
                + "rollNo=" + rollNo
                + ", name='" + name + '\''
                + ", age=" + age
                + '}';
    }
    public int compareTo(Student other) {
        return Integer.compare(this.rollNo, other.rollNo);
    }
}

public class ComparableRollNO {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(102, "Alice", 20));
        students.add(new Student(101, "Bob", 22));
        students.add(new Student(103, "Charlie", 19));

        Collections.sort(students);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
/*
Student{rollNo=101, name='Bob', age=22}
Student{rollNo=102, name='Alice', age=20}
Student{rollNo=103, name='Charlie', age=19}
 */
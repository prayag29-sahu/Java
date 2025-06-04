
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {

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

    @Override
    public String toString() {
        return "Student{"
                + "rollNo=" + rollNo
                + ", name='" + name + '\''
                + ", age=" + age
                + '}';
    }
}

public class ComparableAge {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(101, "Alice", 22));
        students.add(new Student(102, "Bob", 22));
        students.add(new Student(103, "Charlie", 20));
        students.add(new Student(104, "David", 21));
        students.add(new Student(105, "Aaron", 22));

        Comparator<Student> customComparator = (s1, s2) -> {
            if (s1.getAge() != s2.getAge()) {
                return Integer.compare(s2.getAge(), s1.getAge()); 
            } else {
                return s2.getName().compareTo(s1.getName()); 
            }
        };

        Collections.sort(students, customComparator);
        
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
/*
Student{rollNo=102, name='Bob', age=22}
Student{rollNo=101, name='Alice', age=22}    
Student{rollNo=105, name='Aaron', age=22}    
Student{rollNo=104, name='David', age=21}    
Student{rollNo=103, name='Charlie', age=20}  
 */
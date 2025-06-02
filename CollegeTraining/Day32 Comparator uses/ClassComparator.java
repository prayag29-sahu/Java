
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public String toString() {
        return "RollNo: " + rollNo + ", Name: " + name;
    }
}

class SortByRollNoDesc implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s2.rollNo - s1.rollNo;
    }
}

public class ClassComparator {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(102, "Ram"));
        list.add(new Student(101, "Shyam"));
        list.add(new Student(104, "Mohan"));

        Collections.sort(list, new SortByRollNoDesc());

        for (Student s : list) {
            System.out.println(s);
        }
    }

}
/*
 * RollNo: 104, Name: Mohan
 * RollNo: 102, Name: Ram
 * RollNo: 101, Name: Shyam
 */
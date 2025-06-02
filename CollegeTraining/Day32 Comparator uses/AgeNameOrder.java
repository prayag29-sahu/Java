/*
Question 1: Sort by Age Ascending, then by Name Alphabetically
Create a custom Comparator to sort a list of Student objects by age in ascending order. If two students have
the same age, then sort by name alphabetically
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "age: " + age + ", Name: " + name;
    }
}

class SortByageDesc implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1.age != s2.age) {
            return s1.age - s2.age; 
        } else {
            return s1.name.compareTo(s2.name); 
        }
    }
}

public class AgeNameOrder {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(12, "Ram"));
        list.add(new Student(21, "Shyam"));
        list.add(new Student(12, "Mohan"));

        Collections.sort(list, new SortByageDesc());

        for (Student s : list) {
            System.out.println(s);
        }
    }
}
/*
age: 12, Name: Mohan
age: 12, Name: Ram
age: 21, Name: Shyam
 */
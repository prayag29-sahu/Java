/*
Question 2: Sort by Name Length using Comparator
Create a Comparator that sorts Student objects based on the length of their names. Shorter names should
come first.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    public String toString() {
        return "Name: " + name;
    }
}

class SortBynamelength implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.length()>s2.name.length()?1:-1;
    }
}
public class SortByName {
        public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Ram"));
        list.add(new Student("Shyama"));
        list.add(new Student("Mohan"));

        Collections.sort(list, new SortBynamelength());

        for (Student s : list) {
            System.out.println(s);
        }
    }
}
/*
Name: Ram
Name: Mohan
Name: Shyama
 */
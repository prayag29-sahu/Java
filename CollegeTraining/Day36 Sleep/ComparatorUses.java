
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student> {

    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return age + " " + name;
    }

    public int compareTo(Student s) {
        return this.age - s.age;
    }
}

class SortByName implements Comparator<Student> {

    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

class SortByAge implements Comparator<Student> {

    public int compare(Student s1, Student s2) {
        return s1.age - s2.age;
    }
}

class ComparatorUses {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(20, "Pravesh"));
        list.add(new Student(19, "Ankit"));
        list.add(new Student(23, "Anand"));
        Collections.sort(list, new SortByName());
        for (Student s : list) {
            System.out.println(s.toString());
        }
        Collections.sort(list, new SortByAge());
        for (Student s : list) {
            System.out.println(s.toString());
        }
    }
}
/*
23 Anand
19 Ankit
20 Pravesh
19 Ankit
20 Pravesh
23 Anand
 */
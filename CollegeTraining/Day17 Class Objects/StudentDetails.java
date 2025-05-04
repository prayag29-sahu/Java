// 2. Create a class Student with fields name, rollNumber, and marks. Write a method to display
// student details. Create 3 student objects and display their data
class student {
    String name ;
    int rollNumber;
    int marks;
    student(String n,int rn,int m){
        name=n;
        rollNumber=rn;
        marks=m;
        System.out.println("Name : "+name);
        System.out.println("Roll Number : "+rollNumber);
        System.out.println("Marks : "+marks);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        student s1 = new student("Ram", 1234, 95);
        student s2 = new student("Shyam", 1235, 85);
        student s3 = new student("Mohan", 1236, 55);
    }
}
/*
Name : Ram
Roll Number : 1234
Marks : 95
Name : Shyam
Roll Number : 1235
Marks : 85
Name : Mohan
Roll Number : 1236
Marks : 55
 */
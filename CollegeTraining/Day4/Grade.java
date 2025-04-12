/*
 * Create a class named Student with instance variables name, roll_number, and marks. Inside the
main method print the grade based on the marks. 
 */

public class Grade {
    public static class Student {
        String name = "Ram";
        int roll_number = 1157;
        int marks = 89;
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        if(s1.marks>=90)
        {
            System.out.println("Student details Name : "+s1.name+" Roll number "+s1.roll_number+" Grade : A+");
        } else if(s1.marks>=80&&s1.marks<90)
        {
            System.out.println("Student details Name : "+s1.name+" Roll number "+s1.roll_number+" Grade : A");
        }  else if(s1.marks>=70&&s1.marks<80)
        {
            System.out.println("Student details Name : "+s1.name+" Roll number "+s1.roll_number+" Grade : B+");
        }  else if(s1.marks>=60&&s1.marks<70)
        {
            System.out.println("Student details Name : "+s1.name+" Roll number "+s1.roll_number+" Grade : B");
        } else if(s1.marks>=40&&s1.marks<60)
        {
            System.out.println("Student details Name : "+s1.name+" Roll number "+s1.roll_number+" Grade : c");
        } else if(s1.marks>=0&&s1.marks<40)
        {
            System.out.println("Student details Name : "+s1.name+" Roll number "+s1.roll_number+" Grade : Fail");
        }
    }
}
// o/p (Student details Name : Ram Roll number 1157 Grade : A)
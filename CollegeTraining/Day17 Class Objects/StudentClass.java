// 1. Write a program in java to create a Studentclass and its five object,
// display memory address of 5 objects.
class StudentClass
{
    public static void main(String[] args) {
        StudentClass s1 = new StudentClass();
        StudentClass s2 = new StudentClass();
        StudentClass s3 = new StudentClass();
        StudentClass s4 = new StudentClass();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
/*
StudentClass@251a69d7
StudentClass@7344699f
StudentClass@6b95977
StudentClass@7e9e5f8a
 */
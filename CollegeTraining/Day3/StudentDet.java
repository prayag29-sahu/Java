public class StudentDet {
    public static class Student 
    {
        String name;
        static String School_name = "Model High";
        Student(String stuname)
        {
            name = stuname;
        }
    }
    public static void main(String[] args) {

        Student s1 = new Student("Mohan");
        Student s2 = new Student("Sohan");
        System.out.println("The School name : "+Student.School_name+" and the Two students name are : "+s1.name+" and "+s2.name);

    }
    
}
// o/p (The School name : Model High and the Two students name are : Mohan and Sohan)
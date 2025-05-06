class Student {
    int a;
    Student(int a) {
        a=a;
    }    
    void dis(){
        System.out.println(a);
    }
}
public class WithoutThisOnConstructor {
    public static void main(String[] args) {
        Student s = new Student(45);
        s.dis();
    }
}
// 0  
// bcs instance variable name of class having same name as constructor parameter and initialisation 
class Student {
    int a;

    Student(int a) {
        this.a = a;
    }
    void dis(){
        System.out.println(a);
    }
    
}
public class UsingThisOnConstructor {
    public static void main(String[] args) {
        Student s = new Student(12);
        s.dis();
    }
}
// 12
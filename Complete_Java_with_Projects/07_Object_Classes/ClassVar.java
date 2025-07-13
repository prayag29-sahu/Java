class VarClass {
    String name;
    int age;
}
public class ClassVar {
    public static void main(String[] args) {
        VarClass obj = new VarClass();

        obj.name = "John Doe";
        obj.age = 30;

        System.out.println("Name: " + obj.name);
        System.out.println("Age: " + obj.age);
    }
}
/*
Name: John Doe
Age: 30
 */
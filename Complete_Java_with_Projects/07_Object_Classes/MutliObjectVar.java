class MyVarClass {
    String name;
    int age;
}
public class MutliObjectVar {
    public static void main(String[] args) {
        MyVarClass obj1 = new MyVarClass();
        MyVarClass obj2 = new MyVarClass();
        obj1.name = "Alice";
        obj1.age = 30;
        obj2.name = "Bob";
        obj2.age = 25;
        System.out.println("Name: " + obj1.name + ", Age: " + obj1.age);
        System.out.println("Name: " + obj2.name + ", Age: " + obj2.age);
    }
}
/*
Name: Alice, Age: 30
Name: Bob, Age: 25
 */
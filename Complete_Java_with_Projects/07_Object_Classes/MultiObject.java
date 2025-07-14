class MyClass {
    void display() {
        System.out.println("This is a method in MyClass.");
    }
}

public class MultiObject {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        obj1.display();
        obj2.display();
    }
}
/*
This is a method in MyClass.
This is a method in MyClass.
 */
// class - class -> extends
// class - interface -> implements
// interface - interface -> extends

interface A {
//	public abstract void show();
//	public abstract void config();

    int age = 44;            // final and static 
    String area = "Mumbai";

    void show();

    void config();
}

interface X {

    void run();
}

interface Y extends X {

}

class B implements A, Y {

    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in cofing");
    }

    public void run() {
        System.out.println("running...");
    }
}

public class MultipleInterfaces {

    public static void main(String[] args) {

        A obj;
        obj = new B();

        obj.show();
        obj.config();

        X obj1 = new B();
        obj1.run();

        System.out.println(A.age);  // Accessing static final variable
        // A.area="Hyderabad"; // This line will cause a compile-time error because 'area' is final and cannot be reassigned.
        System.out.println(A.area);

    }
}
/*
in show
in cofing
running...
44
Mumbai
 */
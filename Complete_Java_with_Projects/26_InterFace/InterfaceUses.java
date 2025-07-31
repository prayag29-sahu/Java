
interface A {
//	public abstract void show();
//	public abstract void config();

    int age = 44;            // final and static 
    String area = "Mumbai";

    void show();

    void config();
}

class B implements A {

    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in cofing");
    }
}

public class InterfaceUses {

    public static void main(String[] args) {

        A obj;
        obj = new B();

        obj.show();
        obj.config();
        System.out.println(A.age);  // Accessing static final variable
        // A.area="Hyderabad"; // This line will cause a compile-time error because 'area' is final and cannot be reassigned.
        System.out.println(A.area);

    }
}

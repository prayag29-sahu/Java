
class A {

    public int a = 5;

}

class B extends A {

    public int b = 10;
    private int acc = 1234;

    public int getAcc() {
        return acc;
    }
}
public class PrivateModifier {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a + b);

        A obj = new B();
        System.out.println(obj.a);

        // System.out.println(obj.b); // This line would cause an error because 'b' is not accessible from class A
        B objB = (B) obj; // Downcasting to access subclass members
        System.out.println(objB.b);
        System.out.println(objB.getAcc());
    }
}

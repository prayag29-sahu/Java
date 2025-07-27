
class A {

    protected  int a = 5;

}

class B extends A {

    public int b = 10;
    protected  int acc = 1234;

}
public class ProtectedModifier {
    public static void main(String[] args) {

        A obj = new B();
        System.out.println(obj.a);
        
        B objB = (B) obj; 
        System.out.println(objB.acc);
    }
}



class A {
    public int a = 5;

}
class B extends A {
    public int b = 10;

}   

public class publicModifier {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a + b);
        
        A obj = new B();
        System.out.println(obj.a);

    }
    
}

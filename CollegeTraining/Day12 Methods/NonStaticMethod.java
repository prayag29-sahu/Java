public class NonStaticMethod {
    // non-static method
    void sum(){
        int a=5;
        int b=10;
        System.out.println(a+b);
    }

    public static void main(String[] args) {

        // no-static method call
        NonStaticMethod obj = new NonStaticMethod();
        obj.sum();   // o/p (15)

    }
}

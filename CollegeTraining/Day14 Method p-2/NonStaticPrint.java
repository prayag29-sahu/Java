public class NonStaticPrint {

    void print(){
        System.out.println("This is a non-static method");
    }
    public static void main(String[] args) {
        NonStaticPrint p = new NonStaticPrint();
        p.print();
    }
}
// o/p (This is a non-static method)
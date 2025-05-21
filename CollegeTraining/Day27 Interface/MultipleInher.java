interface A{
    void show();
}
interface B{
    void print();
    void show();
}
class C implements A,B{
    public void show(){
        System.out.println("C for A and B");
    }
    public void print(){
        System.out.println("C for B");
    }
}
public class MultipleInher {
    public static void main(String[] args) {
        C c = new C();
        c.show();// C for A and B
        c.print();// C for B
    }
}
// by default every method and variable in java are default accesses and public use to accecss by a another packedge 
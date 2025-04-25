public class NonStaticArgParaMethod {


    // non-static method
    void sum(int a, int b){
        System.out.println(a+b);
    }

    
public static void main(String[] args) {

    // no-static method call
    NonStaticArgParaMethod obj = new NonStaticArgParaMethod();
    obj.sum(5,10);   // o/p (15)

}
}

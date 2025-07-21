
public class StaticKeyword {

    public static void main(String[] args) {
        // here we use static with main because we call the main function without create object of StaticKeyword class

        // System.out.println(Nonstatic()); // /give error because we not create an object that call Nonstatic method
        StaticKeyword sk = new StaticKeyword();
        System.out.println(sk.Nonstatic());  // when we create object 

        System.out.println(static_method()); // without create object access using static declare method

        // System.out.println(s); // s variable which declare in same class but it gave error because nonstatic function

        System.out.println(st); // access because st declare static 

    }


    // non static method 
    public String Nonstatic(){
        return "Nonstatic method";
    }

    public static String static_method() {
        return "static method";
    }
    int s = 10;

    static int st = 20;
}

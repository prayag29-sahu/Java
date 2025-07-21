
public class AccessMethod {

    public static void main(String[] args) {
        // here we use static with main because we call the main function without create object of AccessMethod class

        // System.out.println(Nonstatic()); // /give error because we not create an object that call Nonstatic method
        AccessMethod sk = new AccessMethod();
        System.out.println(sk.Nonstatic());  // when we create object 

        System.out.println(static_method()); // without create object access using static declare method

    }

    // non static method 
    public String Nonstatic() {
        return "Nonstatic method";
    }

    public static String static_method() {
        return "static method";
    }

}

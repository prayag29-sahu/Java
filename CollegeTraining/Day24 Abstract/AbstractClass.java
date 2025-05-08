abstract class Payment {  // abstract classess not create an object access via child class object
    void details(){
        System.out.println("The Payment Details : ");
    }
}
class UPI extends Payment{
}
public class AbstractClass {
    public static void main(String[] args) {
        Payment P = new UPI(); 
        P.details();
    }
}
// The Payment Details :
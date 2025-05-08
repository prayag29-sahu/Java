abstract class Payment {  // abstract classess not create an object access via child class object
    abstract void pay(int a); // abstract methods not create an object access via child class object
    void details(){
        System.out.println("The Payment Details : ");
    }
}
class UPI extends Payment{
    void pay(int a){ // method Overriding
        System.out.println("Payment Done via UPI "+a);
    }
}
public class AbstractMethod {
    public static void main(String[] args) {
        Payment P = new UPI();
        P.details();
        P.pay(5000);
    }
}
/*
The Payment Details : 
Payment Done via UPI 5000
 */
/*
 * Create a class named BankAccount with instance variables account_number and balance. Inside
the main method declare an amount and adds it to the balance. Create an object and test this
method
 */

public class BankInfo {
    public static class BankAccount{
        double account_number = 12578; 
        double balance = 25000; 
    }
    public static void main(String[] args) {

    BankAccount obj1 = new BankAccount();
    obj1.balance = 30000;
        System.out.println("Bank Account Details = Account Number : "+obj1.account_number+" and Balance : "+obj1.balance );
    }
}
// o/p (Bank Account Details = Account Number : 12578.0 and Balance : 30000.0 )
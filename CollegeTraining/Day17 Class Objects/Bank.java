// 4. Create a class BankAccount with fields accountNumber, accountHolder, and balance. Implement
// methods to deposit and withdraw money
class BankAccount{
    int accountNumber;
    String accountHolder;
    double balance;

    BankAccount(int an,String ah,double bal) {
        accountNumber = an;
        accountHolder = ah;
        balance = bal;
    }
    void deposit(int amm){
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Account Holder Name : "+accountHolder);
        balance+=amm;
        System.out.println("Total balance  : "+balance);
    }
    void withdraw(int amo){
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Account Holder Name : "+accountHolder);
        balance-=amo;
        System.out.println("Total balance  : "+balance);
    }
    
}
public class Bank {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(12345, "Johan", 20000);
        BankAccount b2 = new BankAccount(12346, "Rohan", 15000);
        BankAccount b3 = new BankAccount(12347, "Sohan", 30000);
        b1.deposit(5000);
        System.out.println();
        b1.withdraw(3000);
        System.out.println();
        b2.deposit(2000);
        System.out.println();
        b2.withdraw(4500);
        System.out.println();
        b3.deposit(2000);
        System.out.println();
        b3.withdraw(8000);
    }
}
/*
Account Number : 12345
Account Holder Name : Johan
Total balance  : 25000.0

Account Number : 12345
Account Holder Name : Johan
Total balance  : 22000.0

Account Number : 12346
Account Holder Name : Rohan
Total balance  : 17000.0

Account Number : 12346
Account Holder Name : Rohan
Total balance  : 12500.0

Account Number : 12347
Account Holder Name : Sohan
Total balance  : 32000.0

Account Number : 12347
Account Holder Name : Sohan
Total balance  : 24000.0
 */
public class PrintBalance
{
    public static class BankAccount
    {
        long balance;

        public BankAccount(long bal) {
            balance = bal;
        }
        void display()
        {
            System.out.println("The initial Balance of your bank account is : "+balance);
        }
        
    }
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(500000);
        ba.display();
    }
}
// o/p (The initial Balance of your bank account is : 500000)
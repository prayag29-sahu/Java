public class BankDet {
    public static class BankAccount
    {
        long balance;
        static String bank_name = "XYZ bank";

        public BankAccount(long bal) {
            balance = bal;
        }
        
    }
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(500000);
        System.out.println("The Bank Name : "+BankAccount.bank_name+" and the initial Balance of your bank account is : "+ba.balance);
    }
    
}
// o/p (The Bank Name : XYZ bank and the initial Balance of your bank account is : 500000)
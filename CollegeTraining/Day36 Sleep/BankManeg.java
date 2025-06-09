class Bank implements Runnable{
    static int balance = 1000;
    int withdraw;
    Bank(int withdraw){
        this.withdraw = withdraw;
    }
    public void run(){
        synchronized(Bank.class){
            if(withdraw <= balance){
                System.out.println(Thread.currentThread().getName() + " Amount " + withdraw + " withdraw successfully");
                balance = balance - withdraw;
                System.out.println(Thread.currentThread().getName() + " Remaining Balance: " + balance);
            }
            else{
                System.out.println(Thread.currentThread().getName() + " Insufficient balance");
            }
        }
    }
}

public class BankManeg {
    public static void main(String[] args) {
        Bank b1 = new Bank(800);
        Bank b2 = new Bank(500);
        Thread t1 = new Thread(b1);
        Thread t2 = new Thread(b2);
        t1.start();
        t2.start();
    }
}
/*
Thread-0 Amount 800 withdraw successfully
Thread-0 Remaining Balance: 200
Thread-1 Insufficient balance    // bcs 500 not available
 */

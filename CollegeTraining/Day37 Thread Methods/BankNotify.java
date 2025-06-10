class Bank{
    static int balance = 1000;
    int withdraw;
    Bank(int withdraw){
        this.withdraw = withdraw;
    }
    public synchronized void withdraw(){
        if(withdraw <= balance){
            System.out.println(Thread.currentThread().getName() + " Amount " + withdraw + " withdraw successfully");
            balance = balance - withdraw;
            System.out.println(Thread.currentThread().getName() + " Remaining Balance: " + balance);
        }
        else{
            System.out.println(Thread.currentThread().getName() + " Insufficient balance");
        }
        notify();
    }
    public synchronized void isAvailable(){
        try{
            System.out.println("Waiting for other transaction");
            wait();
        }
        catch(Exception e){

        }
        System.out.println("Now second person can withdraw");
    }
}

public class BankNotify {
    public static void main(String[] args) {
        Bank b1 = new Bank(800);
        Bank b2 = new Bank(500);

        Thread t1 = new Thread(()->{
            b1.withdraw();
        });
        
        Thread t2 = new Thread(()->{
            try{
                b1.isAvailable();
                Thread.sleep(1000);
            }
            catch(Exception e){
                
            }
            b2.withdraw();
        });

        t2.start();
        t1.start();
    }
}
/*
Waiting for other transaction
Thread-0 Amount 800 withdraw successfully
Thread-0 Remaining Balance: 200
Now second person can withdraw
Thread-1 Insufficient balance
 */
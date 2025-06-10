class MyThread extends Thread{
    public void run(){
        for(int i=0; i<=3; i++){
            System.out.println(getName() + " is running with priority " + getPriority());
            Thread.yield();
        }
    }
}

public class ThreadYield {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Low Priority Thread");
        t2.setName("High Priority Thread");

        t1.setPriority(Thread.MIN_PRIORITY); //1
        t2.setPriority(Thread.MAX_PRIORITY); //10

        t1.start();
        t2.start();
    }
}
/*
Low Priority Thread is running with priority 1
High Priority Thread is running with priority 10
Low Priority Thread is running with priority 1
Low Priority Thread is running with priority 1
High Priority Thread is running with priority 10
Low Priority Thread is running with priority 1
High Priority Thread is running with priority 10
High Priority Thread is running with priority 10
 */
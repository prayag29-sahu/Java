
class WaitNotifyThread {

    boolean b = false;

    public synchronized void notification() {
        b = true;
        System.out.println("Producer sending......");
        notify();
    }

    public synchronized void waiting() {
        while (!b) {
            try {
                System.out.println("Consumer waiting.......");
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("consumer recieved");
    }
}

public class WaitNotify {

    public static void main(String[] args) {
        WaitNotifyThread t = new WaitNotifyThread();
        Thread t1 = new Thread(() -> {
            t.waiting();
        });
        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
            t.notification();
        });
        t1.start();
        t2.start();
    }
}
/*
Consumer waiting.......
Producer sending......
consumer recieved
 */
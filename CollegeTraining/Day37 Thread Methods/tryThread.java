public class tryThread {
    public static void main(String[] args) {
        System.out.println("Main Thread");
        Thread t1 = new Thread(()->{
            System.out.println("Thread t1");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            System.out.println("It will print is last");
        });
        t1.start();
    }
}
/*
Main Thread
Thread t1
It will print is last     // print after 2 second
 */
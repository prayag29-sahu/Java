
public class RunnableThreadExamples {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Runnable class");
        r.run();

        Thread t1 = new Thread() {
            public void run() {
                System.out.println("Lambda expression in thread");
            }
        };
        t1.start();
    }
}

/*
Runnable class
Lambda expression in thread
 */




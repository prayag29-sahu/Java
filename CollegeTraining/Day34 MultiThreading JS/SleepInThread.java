
public class SleepInThread {

    public static void main(String[] args) {
        System.out.println("Hello");
        Thread t = new Thread(() -> {
            System.out.println("i am in thread.");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
            System.out.println("after 2 seconds.");
        });
        t.start();
        System.out.println("End.");
    }
}
/*
Hello
End.
i am in thread.
after 2 seconds.
 */
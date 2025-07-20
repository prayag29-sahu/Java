
public class BuilderBufferDifference {
    public static void main(String[] args) throws InterruptedException {
        // Using StringBuilder (not thread-safe)
        StringBuilder sbBuilder = new StringBuilder();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sbBuilder.append("A");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sbBuilder.append("B");
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("StringBuilder length (Expected ~2000): " + sbBuilder.length());  // 1931

        // Using StringBuffer (thread-safe)
        StringBuffer sbBuffer = new StringBuffer();
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sbBuffer.append("A");
            }
        });

        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sbBuffer.append("B");
            }
        });

        t3.start();
        t4.start();
        t3.join();
        t4.join();

        System.out.println("StringBuffer length (Expected 2000): " + sbBuffer.length());  // 2000
    }
}


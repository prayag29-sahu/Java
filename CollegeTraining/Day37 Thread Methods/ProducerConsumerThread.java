

class ProducerConsumer{
    private boolean isSignal = false;

    public synchronized void producer(){
        isSignal = true;
        System.out.println("Producer sending signal");
        notify();
    }

    public synchronized void isSignalGiven(){
        while(!isSignal){
            try{
                System.out.println("Consumer waiting for the signal");
                wait();
            }
            catch(Exception e){

            }
        }
        System.out.println("Consumer got the signal");
    }
}

public class ProducerConsumerThread {

    public static void main(String[] args) {
        ProducerConsumer p1 = new ProducerConsumer();

        Thread t1 = new Thread(() -> {
            p1.isSignalGiven();
        });

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
            }
            p1.producer();
        });

        t1.start();
        t2.start();
    }
}

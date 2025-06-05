class InnerThread{
    public static void main(String[] args) {
        System.out.println("hello now start");
        Thread t = new Thread(()->{
            System.out.println("I am thread.");
        });
        t.start();
    }
}
/*
hello now start
I am thread.
 */
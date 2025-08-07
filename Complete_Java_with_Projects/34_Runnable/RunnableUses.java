
class Z {
}

class A implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class RunnableUses {

    public static void main(String[] args) {
        Runnable obj1 = new A();  // using class A which implements Runnable
        Runnable obj2 = new B();  // using class B which implements Runnable

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        // Optional: Inline anonymous Runnable
        Runnable obj3 = new Runnable() {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Hey");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread t3 = new Thread(obj3);
        t3.start();
    }
}
/*
Hi
Hello
Hi
Hello
Hi
Hello
Hey
Hello
Hi
Hey
Hello
Hi
Hey
Hey
Hey
 */
class Mythread extends Thread{
    public void run(){
        System.out.println("My "+getName());
    }
}
public class StartThread {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        t1.setName("1st thread");
        t1.start();
    }
}

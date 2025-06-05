class Priorthread extends Thread{
public void run(){
    for(int i=0;i<2;i++){
        System.out.println(getName()+" Priority : "+getPriority());
    }
}
}
public class PriorityThread {
    public static void main(String[] args) {
        Priorthread pre1 = new Priorthread();
        Priorthread pre2 = new Priorthread();
        pre1.setName("1st thread");
        pre2.setName("2nd thread");
        pre1.setPriority(Thread.MIN_PRIORITY); // 1
        pre2.setPriority(Thread.MAX_PRIORITY); // 10
        pre1.start();
        pre2.start();
    }    
}
/*
1st thread Priority : 1
2nd thread Priority : 10
1st thread Priority : 1
2nd thread Priority : 10
 */
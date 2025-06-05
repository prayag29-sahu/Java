class Mythread extends Thread{
    public void run(){
        for(int i=0;i<2;i++){
            System.out.println(getName()+" by thread ");
        }
    }
}
public class outerThreadClass {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        Mythread t2 = new Mythread();
        t1.setName("Ram");
        t2.setName("Shyam");
        t1.start();
        t2.start();
    }
}
/*
Ram by thread 
Shyam by thread 
Shyam by thread 
Ram by thread 
 */
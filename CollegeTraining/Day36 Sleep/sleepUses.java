
class Print extends Thread{
    int n;
    Print(int n){
        this.n = n;
    }
    public void run(){
        for(int i=1; i<=n; i++){
            System.out.println(i);
            try{
                Thread.sleep(1000 * i);
            }
            catch(Exception e){

            }
        }
    }
}
public class sleepUses {
        public static void main(String[] args) {
        Print p = new Print(5);
        p.start();
    }
}

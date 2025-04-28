// 2.	WAP to print all even numbers between two given range

public class PrintEvRange {
    public static void main(String[] args) {
        int s = 10;
        int e = 30;
        for(int i=s;i<=e;i++){
            if(i%2==0){
                System.out.print(i +" ");
            }
        }
    }
    
}
// 10 12 14 16 18 20 22 24 26 28 30 
// 16.	WAP to print all prime numbers between two given range
public class CheckPrimeInRange {
    public static void main(String[] args) {
        int s = 20;
        int e = 50;
        for(int i=s;i<e;i++){
            int prime = 1;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    prime = 0;
                    break;
                }
            }
            if(prime==1){
                System.out.print(i+" ");
            }
        }
    }
}
// 23 29 31 37 41 43 47 
// 17.	WAP to print alternate prime numbers between 1 to 100
public class AlternatePrime {
    public static void main(String[] args) {
        int count = 1;
        for(int i=2;i<100;i++){
            int prime = 1;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    prime = 0;
                    break;
                }
            }
            if(prime==1){
                count++;
                if(count%2==0){ // even position
                    System.out.print(i+" ");
                }
            }
        }
    }
}
// 2 5 11 17 23 31 41 47 59 67 73 83 97 
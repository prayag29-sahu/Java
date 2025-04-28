// 15.	WAP to print all prime numbers between 1 to 100
public class PrintAllPrime {
    public static void main(String[] args) {
        for(int i=2;i<100;i++){
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
// 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
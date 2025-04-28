// 19.	WAP to print all perfect numbers between 1 to 100
public class PrintAllPerfectNum {
    public static void main(String[] args) {
        for(int j=2;j<100;j++){
            int sum=0;
            for(int i = 1;i<j;i++){
                if(j%i==0){
                    sum=sum+i;
                }
            }
            if(j==sum){
                System.out.print(j+" ");
            }
        }

    }
}
// 6 28 
// 20.	WAP to print all the perfect number between two given range
public class PrintPerfectInRange {
    public static void main(String[] args) {
        int s = 5;
        int e = 30;
        for(int j=s;j<e;j++){
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
// 22.	WAP to print all Armstrong number between 1 to 200
public class PrintAllArmstr {
    public static void main(String[] args) {
        for(int i=1;i<200;i++){
            int m=i;
            int sum = 0;
            while(m>0){
                int rem = m%10;
                sum+=rem*rem*rem;
                m/=10;
            }
            if(i==sum){
                System.out.print(i+" ");
            }
        }
    }
}
// 1 153 
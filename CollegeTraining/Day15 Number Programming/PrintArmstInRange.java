// 23.	WAP to print all Armstrong number between two given range

public class PrintArmstInRange {
    public static void main(String[] args) {
        int s = 130;
        int e = 550;
        for(int i=s;i<e;i++){
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
// 153 370 371 407 
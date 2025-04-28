// 21.	WAP to check a number is Armstrong or not
public class CheckArmstrong {
    public static void main(String[] args) {
        int n = 153;
        int m=n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum+=rem*rem*rem;
            n/=10;
        }
        if(m==sum){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }
}
// Armstrong
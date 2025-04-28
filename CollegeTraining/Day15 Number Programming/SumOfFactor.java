// 12.	WAP to find sum of all factors of a given number
public class SumOfFactor {
    public static void main(String[] args) {
        int n = 33;
        int sum=0;
        for(int i = 1;i<=n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
// 48
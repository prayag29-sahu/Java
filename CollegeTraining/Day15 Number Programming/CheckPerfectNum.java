// 18.	WAP to check a number is perfect or not
public class CheckPerfectNum {
    public static void main(String[] args) {
        int n = 6;
        int sum=0;
        for(int i = 1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(n==sum){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not Perfect.");
        }
    }
}
// Perfect Number

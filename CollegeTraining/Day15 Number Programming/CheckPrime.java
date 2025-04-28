// 14.	WAP to check a number is prime or not
public class CheckPrime {
    public static void main(String[] args) {
        int num = 13;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
    }
    
}
// Prime
// 6. WAP to check if a number is a Magic Number (sum of recursive number digit is 1 [ex= 1234 1+2+3+4 = 10 = 1+0 = 1] )
public class CheckMagicNum {
    static int sum(int n){
        int sum = 0;
        while(n>0){
            sum+=n%10;
            n/=10;
        } 
        return sum;
    }
    public static void main(String[] args) {
        int a = 1234;
        int s = sum(a);
        while(s>=10){
            s = sum(s);
        }
        if(s==1){
            System.out.println(a+" is magic number.");
        } else {
            System.out.println(a+" is not a magic number.");
        }
    }
}
// 1234 is magic number.
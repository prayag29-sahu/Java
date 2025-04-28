// 10.	WAP to check a number is palindrome or not
public class CheckPalindrom {
    public static void main(String[] args) {
        int num = 12321;
        int rem;
        int n = num;
        int rev = 0;
        while(num>0){
            rem = num%10;
            rev = rem + rev*10;
            num = num/10;
        }
        if(n==rev){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not Palindrom");
        }
    }
}
// Palindrom

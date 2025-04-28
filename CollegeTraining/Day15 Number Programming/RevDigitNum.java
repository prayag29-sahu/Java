// 9.	WAP to print reverse of a given number
public class RevDigitNum {
    public static void main(String[] args) {
        int num = 1234;
        int rem;
        int rev = 0;
        while(num>0){
            rem = num%10;
            rev = rem + rev*10;
            num = num/10;
        }
        System.out.println(rev);
    }
}
// 4321
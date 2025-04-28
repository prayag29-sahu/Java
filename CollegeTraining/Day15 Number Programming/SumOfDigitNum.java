// 7.	WAP to find sum of all digits in a given number
public class SumOfDigitNum {
    
    public static void main(String[] args) {
        int num = 1234;
        int sum = 0;
        while(num>0){
            sum = sum + num%10;
            num = num/10;
        }
        System.out.println(sum);
    }
}
// 10
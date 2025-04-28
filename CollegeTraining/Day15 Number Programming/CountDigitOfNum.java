// 8.	WAP to find the count of all digits in a given number
public class CountDigitOfNum {
    public static void main(String[] args) {
        int num = 1234;
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }
        System.out.println(count);
    }
}
// 4

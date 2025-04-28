// 6.	WAP to extract and display all digits from a given number
public class PrintDigitOfNum {
    public static void main(String[] args) {
        int num = 1234;
        int rem;
        while(num>0){
            rem = num%10;
            System.out.print(rem + " ");
            num = num/10;
        }
    }
}
// 4 3 2 1

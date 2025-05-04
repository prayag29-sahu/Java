// 1.	WAP to remove first digit of a number
public class Remove1stDigit {
    public static void main(String[] args) {
        int a = 232;
        int b = a%(int)Math.pow(10,(int)Math.log10(a));
        System.out.println(b);
    }
}
// 32
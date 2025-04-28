// 26.	WAP to find GCD (HCF) of two numbers
public class GCD {
    public static void main(String[] args) {
        int a = 18;
        int b = 12;
        int c = (a<b)?a:b;
        int gcd = 0;
        for(int i=1;i<=c;i++){
            if(a%i==0&&b%i==0){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
// 6
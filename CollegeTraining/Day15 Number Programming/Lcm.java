// 25.	WAP to find LCM of two numbers
public class Lcm {
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
        int lcm = (a*b)/gcd;
        System.out.println(lcm);
    }
    
}
// 36
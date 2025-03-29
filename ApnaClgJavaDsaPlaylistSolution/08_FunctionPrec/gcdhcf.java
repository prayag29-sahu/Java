import java.util.*;
public class gcdhcf {

    // 9> greatest commen diviser of 2 numbers
    public static int gcd(int a, int b)
    { 
        int rem;
        while(b!=0){
            rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // 9> greatest commen diviser HCF of 2 numbers   
        System.out.print("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("GCD is : "+gcd(a, b));



    }
}

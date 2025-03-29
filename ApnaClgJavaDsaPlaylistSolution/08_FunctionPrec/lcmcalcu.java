import java.util.*;
public class lcmcalcu {

    // 10> greatest commen diviser of 2 numbers
    public static int lcm(int a, int b)
    { 
        int rem;
        int c=a*b;
        while(b!=0){
            rem=a%b;
            a=b;
            b=rem;
        }
        int lcm =c/a;
        return lcm;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

            // 10> LCM of 2 numbers   
            System.out.print("Enter two numbers : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("GCD is : "+lcm(a, b));



    }
}

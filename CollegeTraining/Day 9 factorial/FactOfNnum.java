import java.util.*;
public class FactOfNnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            int fact=1;
            for(int j=1;j<=i;j++){
                fact=fact*i;
            }
            System.out.println("Factorial of "+i+" is :"+fact);
        }
        sc.close();
    }
    
}
/*
4
Factorial of 1 is :1
Factorial of 2 is :4
Factorial of 3 is :27
Factorial of 4 is :256
 */
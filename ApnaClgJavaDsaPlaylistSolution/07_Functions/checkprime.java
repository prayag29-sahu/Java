import java.util.*;

public class checkprime {

    // H.W.
    // prime or not check
    public static int prime(int num)
    {
        int p=1;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                p=0;
                return 0;
            }
        }
    return 1;
    }

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for Check Prime or mot ? : ");
        int num1=sc.nextInt();
        if(prime(num1)==1){
            System.out.println("Prime.");
        }
        else {
            System.out.println("Not Prime.");
        }

        

    }
}

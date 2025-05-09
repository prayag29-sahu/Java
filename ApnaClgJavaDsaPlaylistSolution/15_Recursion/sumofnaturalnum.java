
import java.util.Scanner;


public class sumofnaturalnum {
    public static int sumnatural(int num)
    {
        if(num==1)
        {
            return 1;
        }
        int sum =0;
        sum=num+sumnatural(num-1);
        return sum;

    }
    public static void main(String[] args) {
        System.out.print("Enter an natural number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int total = sumnatural(num);
        System.out.println("Sum of first "+num+" natural number is : "+total);
    }
    
}

import java.util.*;
public class additionofodd {

    // 2> sum of all odd numbers 0-n
    public static int SumOdd(int num)
    {
        int sum =0;
        for (int i = 1; i < num; i=i+2) {
            sum=sum+i;
        }
        return sum;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
            // 2> sum of all odd numbers 0-n
            System.out.print("Enter Number To find Sum of all Odd Numbers : ");
            int num = sc.nextInt();
            System.out.println("Sum of all odd numbers : "+SumOdd(num));


    }
}

import java.util.*;
public class fibonacci {

    // 11> Fibonacci series
    public static void fibo(int num)
    {
        int first = 0;
        int second = 1;
        int result = 0;
        System.out.print(first+" "+second+" ");
        int i=0;
        while(i<num)
        {
                result = first + second;
                first = second;
                second = result;
                System.out.print(result+" ");
                i++;
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // 11> Fibonacci series 
        System.out.print("Enter a range(terms) of fibonacci to print : ");   
        int num = sc.nextInt();
        fibo(num);


    }
}

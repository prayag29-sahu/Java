import java.util.*;
public class fibonacci {
    public static void fib(int num,int first,int second)
    {
        if(num==0||num==1)
        {
            return;
        }
        int fibo = first + second;
        System.out.print(fibo+" ");
        fib(num-1,second,fibo);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the terms of series : ");
        int num = sc.nextInt();
        int first = 0;
        int second = 1;
        System.out.print(first+" "+second+" ");
        fib(num-1,first,second);
    }
    
}

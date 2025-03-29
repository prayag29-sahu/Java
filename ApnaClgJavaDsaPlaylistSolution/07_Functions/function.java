import java.util.*;

public class function {
    public static int sum(int a, int b)
    {
        return a+b;
    }

    public static float multi(float p, float q)
    {
        float num1=p;
        float num2=q;
        float Multiplication = num1*num2;
        return Multiplication;
    }

    public static int fact(int num)
    {
        int result=1;
        for(int i=1;i<=num;i++)
        {
        result=result*i;
        } 
        return result;       
    }

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

    // number even or not
    public static int even(int num)
    {
        if(num%2==0)
        {
            return 1;
        }
        else{
            return 0;
        }

    }

    public static void table(int num)
    { 
        for(int i=1;i<=10;i++)
        {
            int result =num*i;
            System.out.println(num+" X "+i+" = "+result);
        }
    }

    public static int fectorial(int num)
    {
        if(num==1)
        {
            return 1;
        }
        return num*fectorial(num-1);
    }
    
    public static void main(String[] args) {
        // int a=10;
        // int b=20;
        // int c = sum(a,b);
        // System.out.println("Addition : "+c);

        // System.out.println("Enter Two Values : ");
        Scanner sc = new Scanner(System.in);
        // float d = sc.nextFloat();
        // float e = sc.nextFloat();
        // System.out.println("Multiplication : "+multi(d,e));

        // System.out.print("Enter a number for fectorial : ");
        // int num=sc.nextInt();
        // System.out.println("Fectorial : "+fact(num));

        // System.out.print("Enter a number for Check Prime or mot ? : ");
        // int num1=sc.nextInt();
        // if(prime(num1)==1){
        //     System.out.println("Prime.");
        // }
        // else {
        //     System.out.println("Not Prime.");
        // }

        // System.out.print("Enter a number for Check Even or mot ? : ");
        // int num2 = sc.nextInt();
        // if(even(num2)==1){
        //     System.out.println("Even.");
        // }
        // else {
        //     System.out.println("Not Even.");
        // }

        // System.out.print("Enter a number for Table : ");
        // int num3 = sc.nextInt();
        // table(num3);

        System.out.print("Enter a number for Find Fectorial using Recursion : ");  
        int num4 = sc.nextInt();
        System.out.println("Fectorial : "+fectorial(num4));
        

    }
}

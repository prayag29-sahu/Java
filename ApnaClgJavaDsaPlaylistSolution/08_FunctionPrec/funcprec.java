import java.util.*;
public class funcprec {

    // 1> Avarage of 3 numbers
    public static float avg(int a,int b,int c)
    {
        float d;
        d=(a+b+c)/2;
        return d;
    }

    // 2> sum of all odd numbers 0-n
    public static int SumOdd(int num)
    {
        int sum =0;
        for (int i = 1; i < num; i=i+2) {
            sum=sum+i;
        }
        return sum;
    }

    // 3> find greater from 2 number
    public static int greater(int a,int b)
    {
        if(a>b)
            return a;
        else
            return b;
    }

    // 4> circumfrence of circle
    public static float circum(float radius)
    {
        float circumfrence = 2*3.14F*radius;
        return circumfrence;
    }

    // 5> check eligiblity to vote
    public static int egb(int age)
    {
        if(age>18)
        {
            return 1;
        } else 
        {
            return 0;
        }
    }

    // 6> write infinite loop using do while
    public static void infinloop()
    {
        do { 
            System.out.print("Infinite. ");
        } while (true);
    }

    // 7> user numbers count
    public static void count(int num)
    {
        int countpos = 0;
        int countneg = 0;
        int countzero = 0;
        if(num>0)
        {
            countpos++;
            System.out.println("Count of Enter positive numbers :"+countpos);
        } else if(num<0)
        {
            countneg++;
            System.out.println("Count of Enter negative numbers :"+countneg);
        } else if(num==0)
        {
            countzero++;
            System.out.println("Count of Enter Zero numbers :"+countzero);
        }
    } 

    // 8> claculate x^n
    public static int power(int x,int n)
    { int result = 1;
        for(int i=1;i<=n;i++)
        {
            result=result*x;
        }
        return result;
    }

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

        // 1> Avarage of 3 numbers
        // System.out.print("Enter 3 Numbers : ");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // System.out.println("Avarage Of 3 Numbers : "+avg(a,b,c));
        
            // 2> sum of all odd numbers 0-n
            // System.out.print("Enter Number To find Sum of all Odd Numbers : ");
            // int num = sc.nextInt();
            // System.out.println("Sum of all odd numbers : "+SumOdd(num));

        // 3> find greater from 2 number
        // System.out.print("Enter 2 Numbers : ");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println("Greatest Number is : "+greater(a, b));

            // 4> circumfrence of circle
            // System.out.print("Enter Radius of circle : ");
            // float num = sc.nextFloat();
            // System.out.println("Circumference of Circle : "+circum(num));

        //   5> check eligiblity to vote  
        // System.out.print("Enter your age : ");
        // int age = sc.nextInt();
        // if(egb(age)==1)
        // {
        //     System.out.println("You are eligible for vote.");
        // } else {
        //     System.out.println("You are not eligible for vote.");
        // }  
        
            // 6> write infinite loop using do while 
            // infinloop();

        // 7> user numbers count  
        // do { 
        //     System.out.print("Enter 1 for continue and 0 for exit. ");
        //     int o = sc.nextInt();
        //     if(o==1)
        //     {
        //         System.out.println("Enter a number : ");
        //         int num = sc.nextInt();
        //         count(num);
        //     }
        //     else if(o==0)
        //     {
        //         System.out.println("Exit.");
        //         break;
        //     }
            
        // } while (true);

            // 8> claculate x^n
            // System.out.print("Enter Exponention x and power n : ");
            // int a = sc.nextInt();
            // int b = sc.nextInt();
            // System.out.println("Result is : "+power(a, b));

        
        // 9> greatest commen diviser HCF of 2 numbers   
        // System.out.print("Enter two numbers : ");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println("GCD is : "+gcd(a, b));

            // 10> LCM of 2 numbers   
            // System.out.print("Enter two numbers : ");
            // int a = sc.nextInt();
            // int b = sc.nextInt();
            // System.out.println("GCD is : "+lcm(a, b));

        // 11> Fibonacci series 
        System.out.print("Enter a range(terms) of fibonacci to print : ");   
        int num = sc.nextInt();
        fibo(num);


    }
}

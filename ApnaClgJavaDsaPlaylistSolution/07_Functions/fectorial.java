import java.util.*;

public class fectorial {


    public static int fact(int num)
    {
        int result=1;
        for(int i=1;i<=num;i++)
        {
        result=result*i;
        } 
        return result;       
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for fectorial : ");
        int num=sc.nextInt();
        System.out.println("Fectorial of "+num+" is " +fact(num));

        

    }
}

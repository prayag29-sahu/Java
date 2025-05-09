import java.util.*;
public class fectorial {
    public static int fect(int num)
    {
        if(num==1||num==0)
        {
            return 1;
        }
        return num*fect(num-1);
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = sc.nextInt();
        int results = fect(num) ;
        System.out.println("The Fectorial of "+num+" is : "+results);

    }
    
}

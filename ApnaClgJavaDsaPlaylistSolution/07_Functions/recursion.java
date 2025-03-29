import java.util.*;

public class recursion {

    public static int fectorial(int num)
    {
        if(num==1)
        {
            return 1;
        }
        return num*fectorial(num-1);
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for Find Fectorial using Recursion : ");  
        int num4 = sc.nextInt();
        System.out.println("Fectorial : "+fectorial(num4));
        

    }
}

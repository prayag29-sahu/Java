import java.util.*;
public class power {
    public static int powerX(int x, int y)
    {
        if(y==0)
        {
            return 1;
        }
        return x*powerX(x,y-1);
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base and power : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int results = powerX(x,y) ;
        System.out.println("The "+y+" time power of "+x+" is : "+results);

    }
    
}

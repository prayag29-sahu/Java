import java.util.*;
public class powernlogn {
    public static int powerX(int x, int y)
    {
        if(y==0)
        {
            return 1;
        }
        if(y%2==0){
            return powerX(x, y/2)*powerX(x, y/2);
        }
        else{
            return powerX(x, y/2)*powerX(x, y/2)*x;
        }
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

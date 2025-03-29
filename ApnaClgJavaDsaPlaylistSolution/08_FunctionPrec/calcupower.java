import java.util.*;
public class calcupower {


    // 8> claculate x^n
    public static int power(int x,int n)
    { int result = 1;
        for(int i=1;i<=n;i++)
        {
            result=result*x;
        }
        return result;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

            // 8> claculate x^n
            System.out.print("Enter Exponention x and power n : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Power : "+ power(a,b));



    }
}

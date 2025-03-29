import java.util.*;

public class checkeven {


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
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for Check Even or mot ? : ");
        int num2 = sc.nextInt();
        if(even(num2)==1){
            System.out.println("Even.");
        }
        else {
            System.out.println("Not Even.");
        }
        

    }
}

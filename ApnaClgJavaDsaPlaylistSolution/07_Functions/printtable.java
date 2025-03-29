import java.util.*;

public class printtable {


    public static void table(int num)
    { 
        for(int i=1;i<=10;i++)
        {
            int result =num*i;
            System.out.println(num+" X "+i+" = "+result);
        }
    }

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for Table : ");
        int num3 = sc.nextInt();
        table(num3);
        

    }
}

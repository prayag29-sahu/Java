import java.util.*;

public class checkbase2 {
    public static void main(String[] args) {

        // updatebit perform two task set and clear bit
        Scanner sc = new Scanner(System.in);

        // H.W.
        // inputted number is in the power of 2, 2^1 = 2 = 10, 2^2 = 4 = 100, 2^3 = 8 = 1000,  2^4 = 16 = 10000
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        if(n>0 && (n & (n-1))==0)
        {
            System.out.println("Inputted number is in the power of 2");
        }
        else{
            System.out.println("Inputted number is not in the power of 2");
        }

    }
    
}

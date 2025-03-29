import java.util.*;

public class count1s {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // how much 1's in the number 
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        int count = 0;
        while(n>0)
        {
            if((n & 1)==1)
            {
                count++;
            }
            n >>= 1;
        }
        System.out.println("Number of 1's are : "+count);

    }
    
}

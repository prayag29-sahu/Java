import java.util.*;
public class voteegb {

    // 5> check eligiblity to vote
    public static int egb(int age)
    {
        if(age>18)
        {
            return 1;
        } else 
        {
            return 0;
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        //   5> check eligiblity to vote  
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        if(egb(age)==1)
        {
            System.out.println("You are eligible for vote.");
        } else {
            System.out.println("You are not eligible for vote.");
        }  
        
    }
}

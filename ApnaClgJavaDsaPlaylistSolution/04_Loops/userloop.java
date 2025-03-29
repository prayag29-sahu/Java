import java.util.*;

public class userloop {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

    // 3> user conditional loop
    do
    {
    System.out.print("Input 1 - for continue and 0 - for exit. ");
    int in = sc.nextInt();
        if(in==1)
        {
            System.out.print("Enter your marks outoff 100 :  ");
            int marks = sc.nextInt();
            if (marks >= 90) {
                System.out.println("This is Good.");
            } else if (marks <= 89 && marks >= 60) {
                System.out.println("This is also good.");
            } else if (marks <= 59 && marks >= 0) {
                System.out.println("This is good as well.");
            }
        }
        else {
            System.out.println("Exit.");
            break;
        }
    } while (true);
    }
}

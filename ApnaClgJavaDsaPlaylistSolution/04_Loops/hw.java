import java.util.*;

public class hw {
    public static void main(String[] args) {

    // H.W.
    // 1> Print all even number till n
    System.out.print("Enter any number : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=2;i<=n;i=i+2)
    {
        System.out.print(i + " ");
    }

    // 2> for(;;) make infinit loop
    // for (;;) {
    //     System.out.println("Prayag");
    // }

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

    // 4> check number is prime or not
    System.out.println("Enter Any number to check prime ? : ");
    int number = sc.nextInt();
    int prime = 1;
    for(int i=2;i<=number/2;i++)
    {
        if ((number % i) == 0) {
            prime = 0;
            break;
        }
    }
    if (prime==1) {
        System.out.println("prime.");
    }
    else System.out.println("Not Prime.");

    }
}

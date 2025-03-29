import java.util.*;

public class prime {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
    // 4> check number is prime or not
    System.out.print("Enter Any number to check prime ? : ");
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

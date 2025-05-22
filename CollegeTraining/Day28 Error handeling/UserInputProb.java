
import java.util.Scanner;

public class UserInputProb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            int c = a/b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("We can not divide a variable by zero.");
        }
        System.out.println("its work Using exception.");
        sc.close();
    }
}
/*
Enter 2 numbers : 4
0
We can not divide a variable by zero.
its work Using exception.
 */
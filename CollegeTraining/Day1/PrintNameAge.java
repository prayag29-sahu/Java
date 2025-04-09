
import java.util.Scanner;

public class PrintNameAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String name = sc.next();
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        System.out.println("My name is "+name+" and I am "+age+" years old.");
        sc.close();
    }
    
}
/*
 *  Enter your Name : Ram
    Enter your age : 20
    My name is Ram and I am 20 years old.
 */


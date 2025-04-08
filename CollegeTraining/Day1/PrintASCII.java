
import java.util.Scanner;

public class PrintASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  any Character : ");
        char ch = sc.next().charAt(0);
        System.out.println((int)ch);

    }
    
}
/*
 * o/p (Enter  any Character : A
        65)
 */
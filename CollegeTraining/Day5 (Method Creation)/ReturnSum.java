
import java.util.Scanner;

//Create a method that returns the sum of two given numbers
public class ReturnSum {
    public static int sum(int a, int b)
    {
        return a+b;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    System.out.println("Sum : " +sum(x,y));
    sc.close();
    }
}
/*
 *  o/p (5
        10 
        Sum : 15)
 */
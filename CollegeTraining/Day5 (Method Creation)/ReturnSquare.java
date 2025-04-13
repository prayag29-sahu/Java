import java.util.Scanner;
// Define a method that takes a number and returns its square.
public class ReturnSquare {
    public static int Square(int n)
    {
        return n*n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Square : "+Square(num));
        sc.close();
    }
    
}
/*
 *  o/p (5
        Square : 25)
 */
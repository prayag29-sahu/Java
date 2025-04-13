import java.util.Scanner;
// Create a method that takes a string as input and prints that string.
public class StringPrintMethod {
    public static void Print(String str)
    {
        System.out.println(str);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Print(str);
        sc.close();
    }
    
}
/*
 * (Hello World
    Hello World)
 */
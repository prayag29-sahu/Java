
import java.util.Scanner;

//Write a method that receives a string and returns the same string with "Welcome " added before it.
public class ReturnString {
    public static String print(String str)
    {
        return "Welcome "+str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(print(str));
        sc.close();
    }
    
}
// o/p (John
//      Welcome John)
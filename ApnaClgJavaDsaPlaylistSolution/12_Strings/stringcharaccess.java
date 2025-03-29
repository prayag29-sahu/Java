import java.util.*;

public class stringcharaccess {

    public static void main(String args[])
    {

    // string declare
    String firstname = "Prayag";
    System.out.println(firstname);
    System.out.println();

    // string input
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter lastname : ");
    String lastname = sc.next();
    System.out.println(lastname);
    System.out.println();

    // concat string 
    String fullname = firstname+" "+lastname;
    System.out.println("FullName = "+fullname);

    // access charecters
    System.out.print("Enter the position of char to access : ");
    int ch = sc.nextInt();
    System.out.println("Charecter at "+ (ch) +" Position is : "+fullname.charAt(ch-1));

    }
    
}

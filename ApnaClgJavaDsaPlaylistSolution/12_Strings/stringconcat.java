import java.util.*;

public class stringconcat {

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

    }
    
}

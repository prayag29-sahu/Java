import java.util.*;

public class hw {
    public static void main(String args[])
    {        
        // H.W.
        // 1> Print meaning full variables
        int age = 19;
        String firstname = "Prayag";
        String lastname = "sahu";
        System.out.println(firstname + " " + lastname + " " + age);
        
        // 2> Calculate area of circle
        System.out.print("Input Radius Of A Circle : ");
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        float area = 3.14f * radius * radius;
        System.out.println("Area Of Circle : "+area);
        sc.close();
    }
}

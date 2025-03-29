import java.util.Scanner;

public class ifelse {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int num = sc.nextInt();
        
        // If else condition
        if(num>18)
        {
            System.out.println("You do vote.");
        } else if (num < 18 && num>0) {
            System.out.println("You doesn't vote.");
        } else {
            System.out.println("Wrong Input.");
        }

        sc.close();
    }
}

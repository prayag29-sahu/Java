import java.util.Scanner;

public class switchcase {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Your Age : ");
        // int num = sc.nextInt();

        // Switch Case condition
        System.out.print("Input Any Number B/w (1-3) : ");
        int c = sc.nextInt();
        switch (c) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Invalid.");



        
        }
                sc.close();
    }
}

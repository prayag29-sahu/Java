
import java.util.Scanner;


public class checkInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 5: ");
        int input = sc.nextInt();

        switch (input) {
            case 1:
                System.out.println("Input is 1");
                break;
            case 2:
                System.out.println("Input is 2");
                break;
            case 3:
                System.out.println("Input is 3");
                break;
            case 4:
                System.out.println("Input is 4");
                break;
            case 5:
                System.out.println("Input is 5");
                break;
            default:
                System.out.println("Invalid input");
        }
        sc.close();
    }
}
/*
Enter a number between 1 and 5: 3
Input is 3
 */
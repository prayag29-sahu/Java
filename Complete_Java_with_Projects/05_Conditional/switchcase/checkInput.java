
import java.util.Scanner;

public class checkInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day: ");
        String day = sc.nextLine();
        switch (day) {
            case "Monday" ->
                System.out.println("Monday");
            case "Tuesday" ->
                System.out.println("Tuesday");
            case "Saturday", "Sunday" ->
                System.out.println("Holiday");
            default ->
                System.out.println("Enter a valid number");
        }
        sc.close();
    }
}
/*
Enter a number between 1 and 5: 3
Input is 3
 */

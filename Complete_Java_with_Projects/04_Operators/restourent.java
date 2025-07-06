
import java.util.Scanner;

public class restourent {
    public static void main(String[] args) {
        System.out.println("Welcome to the Restaurant Management System");
        System.out.print("What item would you like to order? : ");
        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();
        double price = 100.0; 
        System.out.println("You have ordered: " + item);
                System.out.println("price of " + item + " is 100");
        System.out.print("Please enter the quantity:");
        int quantity = scanner.nextInt();
        System.out.println("You have ordered " + quantity + " of " + item); 
        System.out.println("Total price is: " + (price * quantity));
        System.out.println("Thank you for your order!");
        scanner.close();
    }
}
/*
Welcome to the Restaurant Management System
What item would you like to order? : Samosa
You have ordered: Samosa
price of Samosa is 100
Please enter the quantity: 5
You have ordered 5 of Samosa
Total price is: 500.0
Thank you for your order!
 */
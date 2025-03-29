import java.util.Scanner;

public class Conditional {
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
        
        // H.W. 
        // 1> Create A Calculator
        System.out.print("Enter any Charecter (+,-,*,/,%) : ");
        char operator = sc.next().charAt(0);
        System.out.println("Enter Two Number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch (operator) {
            case '+':
                System.out.println("Addition : " + a + b);
                break;
            case '-':
                System.out.println("Subtraction : " + (a - b));
                break;
            case '*':
                System.out.println("Multiplication : " + a * b);
                break;
            case '/':
                System.out.println("Division : " + a / b);
                break;
            case '%':
                System.out.println("Modulas : " + a % b);
                break;
            default:
                System.out.println("Invalid Input.");

        }

        // 2> print the months according to number
        System.out.print("Input Any Number B/w (1-12) : ");
        int n = sc.nextInt();
        if(n==1)
        {
            System.out.println("January.");
        } else if (n == 2) {
            System.out.println("February.");
        }  else if (n == 3) {
            System.out.println("March.");
        }  else if (n == 4) {
            System.out.println("April.");
        }  else if (n == 5) {
            System.out.println("May.");
        }  else if (n == 6) {
            System.out.println("June.");
        }  else if (n == 7) {
            System.out.println("July.");
        }  else if (n == 8) {
            System.out.println("August.");
        }  else if (n == 9) {
            System.out.println("September.");
        }  else if (n == 10) {
            System.out.println("October.");
        }  else if (n == 11) {
            System.out.println("November.");
        } else if (n == 12) {
            System.out.println("December.");
        }
                sc.close();
    }
}

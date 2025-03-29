import java.util.Scanner;

public class calculator {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
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
                sc.close();
    }
}

public class nestedifelseif {
    public static void main(String[] args) {
        int num = 10;

        if (num > 0) {
            System.out.println("Positive number");
            if (num % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }
        } else if (num < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }
    }
    
}
/*
Positive number
Even number
 */
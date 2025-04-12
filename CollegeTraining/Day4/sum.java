/*
 * Create a class named Calculator inside the main method that declares two local variables a and
b. Print the sum of these variables.
 */

class sum {
    
    public static void main(String[] args) {
        class Calculator{
            int a = 5; 
            int b = 25; 
        }
        Calculator cala = new Calculator();
        Calculator calb = new Calculator();

        System.out.println("Sum = "+ (cala.a+calb.b));
    }
}
// o/p (Sum = 30)
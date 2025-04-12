/*
 * . Create a class named Example inside the main method that declares a local variable num but
does not assign any value to it. Try to print num and observe the output.

 */


public class PrintUnAssignMainVal {
    public static void main(String[] args) {
        class Example{
            int a; 
        }
        Example cala = new Example();

        System.out.println("num declared inside main = "+ cala.a);
    }
    
}
// o/p (num declared inside main = 0)
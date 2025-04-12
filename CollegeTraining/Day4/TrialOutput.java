/*
 * Create a class named Trial with a static variable number. Print the value of number without
    initializing it. Observe the output.
 */

public class TrialOutput {
    public static class Trial{
        static int number;
    }
    public static void main(String[] args) {
        Trial obj1 = new Trial();
        System.out.println(obj1.number);
    }
}
// o/p (0)
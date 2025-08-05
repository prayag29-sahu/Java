
public class FinallyBlock {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e);
        } finally {
            System.out.println("This block always executes, regardless of an exception.");
        }
    }
}

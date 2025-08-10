
class FinallyExample {

    int calcu(int a, int b) {
        int result = 0;
        try {
            result = a / b; // This may throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e);
            return 0;
        } finally {
            System.out.println("This block always executes, regardless of an exception.");
        }
        System.out.println("Access ?"); // not run because of return in catch block
        return result;
    }
}

public class Finally {

    public static void main(String[] args) {
        FinallyExample example = new FinallyExample();
        int result = example.calcu(10, 0);
        System.out.println("Result: " + result);
    }
}
/*
Caught an exception: java.lang.ArithmeticException: / by zero
This block always executes, regardless of an exception.
Result: 0
 */
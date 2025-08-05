
public class MultipleExep {
    public static void main(String[] args) {
        int a = 10;
        int b=0;
        try {
            System.out.println(a / b); // This will throw an ArithmeticException
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // This will throw an ArrayIndexOutOfBoundsException

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds    : " + e);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e);
        }
        System.out.println("Working....");
    }
}

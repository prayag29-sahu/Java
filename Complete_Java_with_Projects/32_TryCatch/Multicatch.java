
public class Multicatch {

    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds    : " + e);
        } catch (Exception e) {
            System.out.println("Arithmetic error: " + e);
        }
    }
}
// Array index is out of bounds    : java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3

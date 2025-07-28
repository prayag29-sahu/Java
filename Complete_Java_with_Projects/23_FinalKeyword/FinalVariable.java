
public class FinalVariable {

    public static void main(String[] args) {

        final int num = 8;
        // num = 9; // This line will cause a compilation error because num is declared as final and cannot be reassigned.
        // Uncommenting the above line will result in an error: "cannot assign a value to final variable num"
        // To fix this, simply remove the reassignment line.
        System.out.println(num);

    }
}

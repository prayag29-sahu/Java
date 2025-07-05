
public class BitwiseNot {

    public static void main(String[] args) {
        int a = 5;  // 0101
        System.out.println("~a: " + (~a)); // -6
        System.out.println("Binary of " + a + " is: " + Integer.toBinaryString(a)); // 101
        System.out.println("Binary of " + ~a + " is: " + Integer.toBinaryString(~a)); // 11111111111111111111111111111010

    }
}

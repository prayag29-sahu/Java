public class Assignment {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        // Assignment operators
        a += b; // a = a + b
        System.out.println("After += : " + a); // 12

        a -= b; // a = a - b
        System.out.println("After -= : " + a); // 10

        a *= b; // a = a * b
        System.out.println("After *= : " + a); // 20

        a /= b; // a = a / b
        System.out.println("After /= : " + a); // 10

        a %= b; // a = a % b
        System.out.println("After %= : " + a); // 0
    }
}

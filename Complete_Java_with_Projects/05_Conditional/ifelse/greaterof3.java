public class greaterof3 {
    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        int c = 20;

        if (a >= b && a >= c) {
            System.out.println("a is the greatest: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("b is the greatest: " + b);
        } else {
            System.out.println("c is the greatest: " + c);
        }
        // Output: c is the greatest: 20
    }
}

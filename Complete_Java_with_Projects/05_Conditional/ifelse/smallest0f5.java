public class smallest0f5 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;
        int d = 20;
        int e = 25;

        if (a <= b && a <= c && a <= d && a <= e) {
            System.out.println("a is the smallest: " + a);
        } else if (b <= a && b <= c && b <= d && b <= e) {
            System.out.println("b is the smallest: " + b);
        } else if (c <= a && c <= b && c <= d && c <= e) {
            System.out.println("c is the smallest: " + c);
        } else if (d <= a && d <= b && d <= c && d <= e) {
            System.out.println("d is the smallest: " + d);
        } else {
            System.out.println("e is the smallest: " + e);
        }
    }
}
// Output: a is the smallest: 5
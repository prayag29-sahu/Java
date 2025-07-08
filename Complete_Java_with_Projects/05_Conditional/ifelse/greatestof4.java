public class greatestof4 {
    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        int c = 20;
        int d = 25;

        if (a >= b && a >= c && a >= d) {
            System.out.println("a is the greatest: " + a);
        } else if (b >= a && b >= c && b >= d) {
            System.out.println("b is the greatest: " + b);
        } else if (c >= a && c >= b && c >= d) {
            System.out.println("c is the greatest: " + c);
        } else {
            System.out.println("d is the greatest: " + d);
        }   
    }
}
// d is the greatest: 25
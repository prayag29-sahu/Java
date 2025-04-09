public class Conditional {
    public static void main(String[] args) {
        int a = -11;
        if (a > 0) {
            System.out.println("Positive Number.");
        } else {
            System.out.println("Negative Number.");
        }
        System.out.println("Ternary operation : ");
        int c = (a%2==0) ? 1 : 0;
        if (c == 1) {
            System.out.println("Even Number.");
        } else {
            System.out.println("Odd Number.");
        }

    }
}
// o/p (Negative Number.
//      Ternary operation :
//      Odd Number.)

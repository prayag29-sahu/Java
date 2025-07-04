public class LogicalNOR {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = false;

        // Logical NOR operator
        System.out.println("!(a || b): " + !(a || b)); // false
        System.out.println("!(a || c): " + !(a || c)); // false
        System.out.println("!(a || d): " + !(a || d)); // false
        System.out.println("!(b || c): " + !(b || c)); // false
        System.out.println("!(b || d): " + !(b || d)); // true
        System.out.println("!(c || d): " + !(c || d)); // false
        System.out.println("!(a && (b || c)): " + !(a && (b || c))); // false
        System.out.println("!(a && (b && c)): " + !(a && (b && c))); // true
        System.out.println("!(a && (c || d)): " + !(a && (c || d))); // false
        System.out.println("!(b && (c || d)): " + !(b && (c || d))); // true
        System.out.println("!(c && (b || d)): " + !(c && (b || d))); // false
        System.out.println("!(d && (b || c)): " + !(d && (b || c))); // true
        System.out.println("!(a ^ b): " + !(a ^ b)); // false
        System.out.println("!(a ^ c): " + !(a ^ c)); // true
    }
}

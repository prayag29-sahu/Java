public class LogicalAND {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = false;

        // Logical AND operator
        System.out.println("a && b: " + (a && b)); // false
        System.out.println("a && c: " + (a && c)); // true
        System.out.println("a && d: " + (a && d)); // false
        System.out.println("b && c: " + (b && c)); // false
        System.out.println("b && d: " + (b && d)); // false
        System.out.println("c && d: " + (c && d)); // false
        System.out.println("a && (b || c): " + (a && (b || c))); // true
        System.out.println("a && (b && c): " + (a && (b && c))); // false
        System.out.println("!(a && b): " + !(a && b)); // true
            
    }
    
}

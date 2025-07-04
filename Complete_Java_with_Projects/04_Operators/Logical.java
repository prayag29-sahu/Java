public class Logical {
    public static void main(String[] args) {
        
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = false;
        // Logical operators
        System.out.println("a && b: " + (a && b)); // false
        System.out.println("a && c: " + (a && c)); // true
        System.out.println("a && d: " + (a && d)); // false
        System.out.println("b && c: " + (b && c)); // false
        System.out.println("b && d: " + (b && d)); // false
        System.out.println("c && d: " + (c && d)); // false     
        System.out.println("a || b: " + (a || b)); // true
        System.out.println("a || c: " + (a || c)); // true  
        System.out.println("a || d: " + (a || d)); // true
        System.out.println("b || c: " + (b || c)); // true
        System.out.println("b || d: " + (b || d)); // false
        System.out.println("c || d: " + (c || d)); // true
        System.out.println("!a: " + !a); // false
        System.out.println("!b: " + !b); // true
        System.out.println("!c: " + !c); // false
        System.out.println("!d: " + !d); // true
        System.out.println("a ^ b: " + (a ^ b)); // true
        System.out.println("a ^ c: " + (a ^ c)); // false
        System.out.println("a ^ d: " + (a ^ d)); // true
        System.out.println("b ^ c: " + (b ^ c)); // true        
        System.out.println("b ^ d: " + (b ^ d)); // false
        System.out.println("c ^ d: " + (c ^ d)); // true
        System.out.println("a && (b || c): " + (a && (b || c))); // true
        System.out.println("a || (b && c): " + (a || (b && c))); // true
        System.out.println("!(a && b): " + !(a && b)); // true
        System.out.println("!(a || b): " + !(a || b)); // false
        System.out.println("a && b || c: " + (a && b || c)); // true
        System.out.println("a || b && c: " + (a || b && c)); // true
        System.out.println("a && b && c: " + (a && b && c)); // false
        System.out.println("a || b || c: " + (a || b || c)); // true
        System.out.println("a && b && c && d: " + (a && b && c && d)); // false
        System.out.println("a || b || c || d: " + (a || b || c || d)); // true
        System.out.println("a && (b || (c && d)): " + (a && (b || (c && d)))); // true
        System.out.println("a || (b && (c || d)): " + (a || (b && (c || d)))); // true
        System.out.println("!(a && (b || c)): " + !(a && (b || c))); // false
        System.out.println("!(a || (b && c)): " + !(a || (b && c))); // false
        System.out.println("a ^ (b || c): " + (a ^ (b || c))); // true
        System.out.println("a ^ (b && c): " + (a ^ (b && c))); // true
        System.out.println("!(a ^ b): " + !(a ^ b)); // false
        System.out.println("!(a ^ c): " + !(a ^ c)); // true
        System.out.println("!(a ^ d): " + !(a ^ d)); // false
        System.out.println("!(b ^ c): " + !(b ^ c)); // false
        System.out.println("!(b ^ d): " + !(b ^ d)); // true
        System.out.println("!(c ^ d): " + !(c ^ d)); // false
        System.out.println("a && b && c || d: " + (a && b && c || d)); // false
        System.out.println("a || b || c && d: " + (a || b || c && d)); // true
        System.out.println("a && (b || c) && d: " + (a && (b || c) && d)); // false
        System.out.println("a || (b && c) || d: " + (a || (b && c) || d)); // true
        System.out.println("!(a || (b && c) || d): " + !(a || (b && c) || d)); // false
        System.out.println("!(a || (b && c) || d): " + !(a || (b && c) || d)); // false
        System.out.println("!(a && (b || c) || d): " + !(a && (b || c) || d)); // false
        System.out.println("!(a && (b || c) || d): " + !(a && (b || c) || d)); // false
        System.out.println("a ^ (b || c) || d: " + (a ^ (b || c) || d)); // true
        System.out.println("a ^ (b && c) || d: " + (a ^ (b && c) || d)); // true
        System.out.println("a && (b || c) || d: " + (a && (b || c) || d)); // true
        System.out.println("a || (b && c) || d: " + (a || (b && c) || d)); // true
        System.out.println("!(a && (b || c) || d): " + !(a && (b || c) || d)); // false
        System.out.println("!(a || (b && c) || d): " + !(a || (b && c) || d)); // false
    }
}

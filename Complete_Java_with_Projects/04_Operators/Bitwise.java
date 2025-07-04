public class Bitwise {
    public static void main(String[] args) {
        int a = 5;  // 0101
        int b = 3;  // 0011
        System.out.println("a & b: " + (a & b)); // 1
        System.out.println("a | b: " + (a | b)); // 7
        System.out.println("a ^ b: " + (a ^ b)); // 6
        System.out.println("~a: " + (~a));       // -6
        System.out.println("a << 1: " + (a << 1)); // 10
        System.out.println("a >> 1: " + (a >> 1)); // 2
        System.out.println("a >>> 1: " + (a >>> 1)); // 2
        System.out.println("b >> 1: " + (b >> 1)); // 1
        System.out.println("b >>> 1: " + (b >>> 1)); // 1
        System.out.println("a & (b | 2): " + (a & (b | 2))); // 1
        System.out.println("a | (b & 2): " + (a | (b & 2))); // 7
        System.out.println("a ^ (b | 2): " + (a ^ (b | 2))); // 6
        System.out.println("a ^ (b & 2): " + (a ^ (b & 2))); // 7
    }
}

public class Rightshift {
    public static void main(String[] args) {
        int a = 5;  // 0101
        System.out.println("a >> 1: " + (a >> 1)); // 2
        System.out.println("Binary of " + a + " is: " + Integer.toBinaryString(a)); // 101
        System.out.println("Binary of " + (a >> 1) + " is: " + Integer.toBinaryString(a >> 1)); // 10
    }
}

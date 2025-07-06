public class unsignedrightshift {
    public static void main(String[] args) {
        int a = 8; // 00000000 00000000 00000000 00001000
        int b = a >>> 2; // 00000000 00000000 00000000 00000010
        System.out.println(Integer.toBinaryString(b)); // 11111111111111111111111111111110
        System.out.println("a >>> 2: " + b); // 107374182
    }
}

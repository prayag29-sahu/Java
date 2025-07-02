public class Byte {
    public static void main(String[] args) {
        
        byte b = 1;
        System.out.println(b); // 1

        byte b1 = 0;
        System.out.println(b1); // 0

        byte b2 = 10;
        System.out.println(b2); // 10

        // byte b3 = 100000;
        // System.out.println(b3); //  incompatible types: possible lossy conversion from int to byte

        byte b4 = 'A';
        System.out.println(b4); // 65 (Ascii of A)
    }
}

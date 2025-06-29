public class longVar {
    public static void main(String[] args) {

        long l = 1000000000;
        System.out.println(l);  //  1000000000

        long l1 = -1000000000;
        System.out.println(l1);  //  -1000000000

        // long l2 = 10000000000;
        // System.out.println(l2);  //   error: integer number too large

        long l3 = 1000000000L;
        System.out.println(l3);  //  1000000000
    }
}

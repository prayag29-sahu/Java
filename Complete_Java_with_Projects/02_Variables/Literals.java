
public class Literals {

    public static void main(String[] args) {
        int num1 = 0b101;
        System.out.println(num1);

        int num2 = 0x7E;
        System.out.println(num2);

        int num3 = 10_00_00_000;
        System.out.println(num3);

        float num4 = 56;
        System.out.println(num4);

        double num5 = 56;
        System.out.println(num5);

        double num6 = 12e10;
        System.out.println(num6);

        boolean num7 = true;
        System.out.println(num7);

        char c = 'a';
        System.out.println(c);
        c++;

        char c1 = 'a';
        c1++;
        System.out.println(c1);
    }
}
/*
5
126
100000000
56.0
56.0
1.2E11
true
a
b
 */

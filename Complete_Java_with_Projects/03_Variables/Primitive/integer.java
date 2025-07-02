
public class integer {
        public static void main(String[] args) {
        int a;
        // System.out.println(a);   // (variable a might not have been initialized)
        a=10;
        System.out.println(a);    // 10
        System.out.println("The number is : "+ a);    // The number is : 10
        System.out.println("The number is : "+ "a");    // The number is : a

        a=-10;
        System.out.println("The number is : "+ a); // The number is : -10

        a='A';
        System.out.println("The number is : "+ a); // The number is : 65          (the ASCII value char A)
        // a=10.5;
        // System.out.println(a);    // incompatible types: possible lossy conversion from double to int
    }
}

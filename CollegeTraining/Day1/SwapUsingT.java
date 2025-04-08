public class SwapUsingT {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before Swaping : a = "+a+" b= "+b);
        int t = a;
        a = b;
        b = t;
        System.out.println("After Swaping : a = "+a+" b = "+b);

    }
    
}
/*
 * o/p  (Before Swaping : a = 10 b= 20
        After Swaping : a = 20 b = 10)
 */

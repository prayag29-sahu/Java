// 29.	WAP to print Fibonacci numbers in a given range
public class PrintFibonacciInRange {
    public static void main(String[] args) {
        int s = 3;
        int e = 22;
        
        int a = 0, b = 1;
        int c = 0;
        
        while (c <= e) {
            if (c >= s) {
                System.out.print(c + " ");
            }
            a = b;
            b = c;
            c = a + b;
        }
    }
}
// 3 5 8 13 21 

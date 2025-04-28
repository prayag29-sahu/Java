// 28.	WAP to print Fibonacci series up to n terms
public class PrintFibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int i=1;
        System.out.print(a+" "+b+" ");
        while(i<=8){
            int c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
            i++;
        }
    }
}
// 0 1 1 2 3 5 8 13 21 34 
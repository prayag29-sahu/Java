/*
Create a class with multiple sum methods where one takes two integers, another takes three integers, and another takes two double values. All methods should print the sum of the arguments passed.
 */
class MultiSum {
    void sum(int a,int b){
        System.out.println((a+b));
    }
    void sum(int a,int b,int c){
        System.out.println((a+b+c));
    }
    void sum(double a,double b){
        System.out.println((a+b));
    }
}
public class SumOverloaded {
    public static void main(String[] args) {
        MultiSum ms = new MultiSum();
        ms.sum(10, 20);
        ms.sum(10, 20,30);
        ms.sum(10.5, 20.5);
    }
}
/*
30
60
31.0
 */
public class NonStaticSum {
    void sum(double n,double m){
        System.out.println(n+m);
    }
    public static void main(String[] args) {
        double a = 3.5;
        double b = 4.5;
        NonStaticSum s = new NonStaticSum();
        s.sum(a, b);
    }
    
}// o/p (8.0)

public class NonStaticMulti {
    void multi(int n,int m){
        System.out.println(n*m);
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        NonStaticMulti s = new NonStaticMulti();
        s.multi(a, b);
    }
}
// o/p (12)
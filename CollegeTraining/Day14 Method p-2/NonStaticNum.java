public class NonStaticNum {
    void num(int n){
        System.out.println("The given number is : "+n);
    }
    public static void main(String[] args) {
        int a =  10;
        NonStaticNum nm = new NonStaticNum(); 
        nm.num(a);

    }
}
// o/p (The given number is : 10)
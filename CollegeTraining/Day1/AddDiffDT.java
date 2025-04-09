public class AddDiffDT {
    public static void main(String[] args) {
        int x = 5; 
        int a = 10; 
        float y = 10.0f;
        float b = 20.0f;
        System.out.println(x +a + y + b);
        byte p= 20;
        byte q= 30;
        byte r = (byte)(p+q); // bydefault it give addition in int
        System.out.println(r);  
        System.out.println("Hello"+10+10);// Hello1010
        System.out.println(10+10+"Hello");// 20Hello
    }
    
}
/*
 * o/p (45.0
        50
        Hello1010
        20Hello)
 */
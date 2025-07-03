public class Decrement {
    public static void main(String[] args) {
        int a = 10;
        a--;
        System.out.println("After decrement: " + a); // 9
        --a;
        System.out.println("After decrement: " + a--); // 8
        System.out.println("After decrement: " + a); // 7
    }
}

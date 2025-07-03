public class increment {
    public static void main(String[] args) {
        int a=10;
        a++;
        System.out.println("After increment: " + a); // 11
        ++a;
        System.out.println("After increment: " + a++); // 12
        System.out.println("After increment: " + a); // 13
    }
}

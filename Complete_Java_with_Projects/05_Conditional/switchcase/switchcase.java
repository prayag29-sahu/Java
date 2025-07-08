
public class switchcase {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        switch (Integer.compare(a, b)) {
            case -1:
                System.out.println("a is smaller than b");
                break;
            case 1:
                System.out.println("b is smaller than a");
                break;
            default:
                System.out.println("a is equal to b");
        }
    }
}
// a is smaller than b

public class truefalse {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        switch (Boolean.compare(a, b)) {
            case -1:
                System.out.println("a is false");
                break;
            case 1:
                System.out.println("b is false");
                break;
            default:
                System.out.println("a and b are equal");
        }
    }
}
// b is false

public class StrReplace {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Rohan");

        sb.replace(0, 3, "Hello");
        System.out.println(sb); // Helloan
    }
}

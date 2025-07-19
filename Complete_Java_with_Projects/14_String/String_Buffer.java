
public class String_Buffer {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Prayag");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
        sb.append("Sahu");
        System.out.println(sb);

    }
}

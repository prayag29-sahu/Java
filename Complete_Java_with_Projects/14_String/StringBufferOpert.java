public class StringBufferOpert {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("Rohan");
		
		String str=sb.toString();
		System.out.println(str);
		sb.deleteCharAt(2);
        System.out.println(sb);
		sb.insert(0,"Java");
        System.out.println(sb);
		sb.insert(6,"java");
        System.out.println(sb);
		sb.setLength(30);
		sb.ensureCapacity(100);
        System.out.println(sb.length());
        System.out.println(sb.capacity());

    }
}
/*
Rohan
Roan
JavaRoan
JavaRojavaan
30
100
 */
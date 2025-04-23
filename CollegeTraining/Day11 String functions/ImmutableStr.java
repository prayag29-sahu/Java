public class ImmutableStr {
    public static void main(String[] args) {
        String str = "hello";
        String str1 = "hello";
        // both store same value so it use only one address and str or str1 hold value address

        String str2 = "hwexh";

        String str3 = new String("hii");
        String str4 = new String("hii");

        // System.out.println(str==str1); // true

        System.out.println(str.compareTo(str1)); //  0  (true)  bcs compareTo() check value

        System.out.println(str.compareTo(str2)); //  -18  (false)  bcs compareTo() check value

        System.out.println(str3.compareTo(str4)); //  0  (true)  bcs compareTo() check value

        // String str1 = str; 
        // System.out.println(str1==str); //true

        // String str1 = str+"";
        // System.out.println(str1==str);  // false

        // System.out.println(str3==str4); // false bcs == compare address
    }
    
}

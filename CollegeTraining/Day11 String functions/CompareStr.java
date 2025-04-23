public class CompareStr {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1.compareTo(str2)); // 0 (true)
        System.out.println(str1==str2);  // true
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equalsIgnoreCase(str2)); // true
    }
    
}


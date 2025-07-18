public class StrCompare {
    public static void main(String[] args) {
        
        String s1 = "Prayag";
        String s2 = "Prayag";
        String s3 = "Parag";

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
    }
}
/*
true
false
0  // true
17 // false
 */
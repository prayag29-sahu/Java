
public class CompareStrings {
    public static void main(String[] args) {
        String s1 = "Ankit";
        String s2 = "Anand";

        System.out.println("s1.compareTo(s2): " + s1.compareTo(s2));
        System.out.println("s2.compareTo(s1): " + s2.compareTo(s1));
        System.out.println("s1.equals(s2): " + s1.equals(s2));
    }
}

/*
s1.compareTo(s2): 10
s2.compareTo(s1): -10
s1.equals(s2): false
 */
public class CheckStringRotate {
    public static boolean isRotation(String s1, String s2) {
        if (s1 == null || s2 == null)
            return false;
        if (s1.length() != s2.length())
            return false;

        String combined = s1 + s1;  // abcdabcd
        return combined.contains(s2); // ab|cdab|cd
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";

        if (isRotation(s1, s2)) {
            System.out.println(s2 + " is a rotation of " + s1);
        } else {
            System.out.println(s2 + " is NOT a rotation of " + s1);
        }
    }
}
// cdab is a rotation of abcd

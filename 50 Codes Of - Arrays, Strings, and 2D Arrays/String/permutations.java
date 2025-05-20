public class permutations {
    public static void permute(String str, String perm) {
        if (str.length() == 0) {
            System.out.print(perm+" ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);
            permute(newstr, perm + ch);
        }
    }

    public static void main(String[] args) {
        permute("abc", "");
    }
}
// abc acb bac bca cab cba 
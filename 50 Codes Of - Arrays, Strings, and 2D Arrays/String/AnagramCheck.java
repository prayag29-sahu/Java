import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        if (Arrays.equals(a1, a2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
// Anagramspublic class CheckAnagrams {
//   public static void main(String[] args) {
//         String s1 = "listen";
//         String s2 = "silent";

//         boolean result = areAnagrams(s1, s2);
//         System.out.println(result);
//     }

//     static boolean areAnagrams(String s1, String s2) {
//         if (s1.length() != s2.length()) return false;

//         int[] count = new int[26]; 
//         for (int i = 0; i < s1.length(); i++) {
//             count[s1.charAt(i) - 'a']++; //c[11]++,c[8]++,c[18]++,c[19]++,c[4]++,c[13]++,
//                     // System.out.println(count[s1.charAt(i) - 'a']++);
//             count[s2.charAt(i) - 'a']--; //c[18]++,c[8]++,c[11]++,c[4]++,c[13]++,c[19]++,
//                     // System.out.println(count[s2.charAt(i) - 'a']--);
//         }

//         for (int c : count) {
//             if (c != 0) return false;
//         }

//         return true;
//     }
    
// }

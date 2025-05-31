import java.util.Arrays;

public class GroupAnagrams {
        private static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        int n = strs.length;
        String[][] groups = new String[n][n]; 
        int[] groupSizes = new int[n];
        int groupCount = 0;

        for (int i = 0; i < n; i++) {
            String current = strs[i];
            boolean placed = false;

            for (int g = 0; g < groupCount; g++) {
                if (isAnagram(groups[g][0], current)) {
                    groups[g][groupSizes[g]++] = current;
                    placed = true;
                    break;
                }
            }

            if (!placed) {
                groups[groupCount][0] = current;
                groupSizes[groupCount] = 1;
                groupCount++;
            }
        }

        for (int g = 0; g < groupCount; g++) {
            System.out.print("[");
            for (int j = 0; j < groupSizes[g]; j++) {
                System.out.print(groups[g][j]);
                if (j < groupSizes[g] - 1) System.out.print(", ");
            }
            System.out.println("]");
        }

    }
}
/*
[eat, tea, ate]
[tan, nat]
[bat]
 */
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int[] lastIndex = new int[128]; // For ASCII
        for (int i = 0; i < 128; i++) {
            lastIndex[i] = -1;
        }

        int maxLen = 0;
        int left = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);// a,b,c,a,b,c,b,b
            if (lastIndex[ch] >= left) { // f,f,f,t,t,t,t,t
                left = lastIndex[ch] + 1;// 0+1=1,1+1=2,2+1=3,4+1=5,6+1=7
            }
            lastIndex[ch] = i;//0,1,2,3,4,5,6
            maxLen = Math.max(maxLen, i - left + 1);//1,2,3,3,3,3,3,3
        }

        return maxLen;
    }

    public static void main(String[] args) {
        LongestSubstring sol = new LongestSubstring();
        String s = "abcabcbb";
        System.out.println(sol.lengthOfLongestSubstring(s));
    }
}
 // Output: 3
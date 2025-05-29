import java.util.HashMap;

class CheckAnagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        
        if (s1.length() != s2.length()) {
            System.out.println("They are not anagrams");
            return;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : s2.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                System.out.println("They are not anagrams");
                return;
            }
            map.put(c, map.get(c) - 1);
        }

        System.out.println("They are anagrams");
    }
}
// They are anagrams
import java.util.HashMap;

class OccurenceOfStringChar{
    public static void main(String[] args) {
        String str = "programming";
        char[] ch = str.toCharArray();
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(char c : ch){
            map1.put(c, map1.getOrDefault(c, 0)+1);
        }
        System.out.println(map1);
    
    }
}
// {p=1, a=1, r=2, g=2, i=1, m=2, n=1, o=1}
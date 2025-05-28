import java.util.HashMap;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "aaabsdsdf";
        char[] ch = str.toCharArray();
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(char c : ch){
            map1.put(c, map1.getOrDefault(c, 0)+1);
        }
        for(char c : map1.keySet()){
            if(map1.get(c)==1){
                System.out.println(c);
                break;
            }
        }

    }
}
// b
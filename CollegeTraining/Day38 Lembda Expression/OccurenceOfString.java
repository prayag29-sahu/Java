import java.util.HashMap;

public class OccurenceOfString {
    public static void main(String[] args) {
        String str = "programming is a fun and fun is a programming";
        String[] words = str.split(" ");
        HashMap<String,Integer> map1 = new HashMap<>();
        for(String s : words){
            map1.put(s, map1.getOrDefault(s, 0)+1);
        }
        System.out.println(map1);
    
    }
}
// {a=2, and=1, is=2, programming=2, fun=2}
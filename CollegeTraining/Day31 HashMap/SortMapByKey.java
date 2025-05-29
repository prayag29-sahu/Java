
import java.util.HashMap;
import java.util.TreeMap;

public class SortMapByKey {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Banana", 10);
        map.put("Apple", 20);
        map.put("Mango", 30);
        TreeMap<String,Integer> tree = new TreeMap<>(map);
        System.out.println(tree);
    }
    
}
// {Apple=20, Banana=10, Mango=30}
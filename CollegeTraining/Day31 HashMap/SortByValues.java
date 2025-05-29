import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SortByValues {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Banana", 10);
        map.put("Apple", 5);
        map.put("Mango", 3);
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        for (Map.Entry<String, Integer> entry : list) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
    
}
/*
Mango = 3
Apple = 5
Banana = 10
 */
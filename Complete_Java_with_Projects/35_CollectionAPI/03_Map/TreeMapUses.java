
import java.util.Map;
import java.util.TreeMap;

public class TreeMapUses {

    public static void main(String[] args) {

        Map<String, Integer> students = new TreeMap<>();

        students.put("Prayag", 56);
        students.put("Aditya", 23);
        students.put("lucky", 67);
        students.put("Nitin", 92);
        students.put("Anuj", 45);

        System.out.println(students.keySet());

        for (String key : students.keySet()) {
            System.out.println(key + ":" + students.get(key));
        }

    }
}

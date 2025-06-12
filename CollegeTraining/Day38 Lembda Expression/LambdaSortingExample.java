import java.util.*;

public class LambdaSortingExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ankit");
        list.add("Pravesh");
        list.add("Anand");

        Collections.sort(list, (a, b) -> a.compareTo(b));
        System.out.println("Sorted list: " + list);
    }
}

// Sorted list: [Anand, Ankit, Pravesh]

import java.util.TreeSet;

public class TreeSetUse {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A"); // A not print bcs hashset remove duplicates 
        set.add("a");
        System.out.println(set);
    }
}
// [A, B, C, a] // set was sorted according to ASCII values
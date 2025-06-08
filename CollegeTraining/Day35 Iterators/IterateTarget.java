import java.util.*;

public class IterateTarget {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ankit");
        list.add("Anand");
        list.add("Pravesh");
        list.add("Prayag");
        list.add("Aditya");
        ListIterator<String> it = list.listIterator();
        String target = "Prayag";
        while (it.hasNext()) {
            if (it.next() == target) {
                System.out.println(it.nextIndex() - 1);
            }
        }
        while (it.hasPrevious()) {
            if (it.previous() == target) {
                System.out.println(it.previousIndex() + 1);
            }
        }
    }
}
/*
3
3
 */
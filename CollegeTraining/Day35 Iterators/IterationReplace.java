
import java.util.ArrayList;
import java.util.ListIterator;

public class IterationReplace {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ankit");
        list.add("Anand");
        list.add("P");
        list.add("Prayag");
        list.add("Aditya");
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()) {
            String data = it.next();
            if (data.length() < 3) {
                it.set("Bye");
            }
        }
        System.out.println(list);
    }
}
// [Ankit, Anand, Bye, Prayag, Aditya]
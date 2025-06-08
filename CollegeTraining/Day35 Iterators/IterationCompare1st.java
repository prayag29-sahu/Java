
import java.util.ArrayList;
import java.util.ListIterator;

public class IterationCompare1st {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("At");
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
        while (it.hasPrevious()) {
            if (it.previous() != list.getFirst()) {
                it.set("Hello");
            }
        }
        System.out.println(list);
    }
}
/*
[Bye, Anand, Bye, Prayag, Aditya]
[Bye, Hello, Bye, Hello, Hello]
 */
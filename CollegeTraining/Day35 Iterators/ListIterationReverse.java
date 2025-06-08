import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterationReverse {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ankit");
        list.add("Anand");
        list.add("Pravesh");
        list.add("Prayag");
        list.add("Aditya");
        ListIterator<String> it = list.listIterator();
        while(it.hasNext()){
            String data = it.next();
            System.out.print(data+" ");
        }
        System.out.println();
        while(it.hasPrevious()){
            String data = it.previous();
            System.out.print(data+" ");
        }
    }
}
/*
Ankit Anand Pravesh Prayag Aditya
Aditya Prayag Pravesh Anand Ankit
 */
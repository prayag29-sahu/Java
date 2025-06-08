import java.util.*;

public class IteratorUses {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ankit");
        list.add("Anand");
        list.add("Pravesh");
        list.add("Prayag");
        list.add("Aditya");
        System.out.println(list);
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String data = it.next();
            if(data.startsWith("P")){
                it.remove();
            }
        }
        System.out.println(list);


    }
}
/*
[Ankit, Anand, Pravesh, Prayag, Aditya]
[Ankit, Anand, Aditya]
 */
import java.util.LinkedList;
public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList();
        long start = System.nanoTime();
        ll.add(23);
        ll.add(24);
        ll.add(25);
        System.out.println(ll);
        long end = System.nanoTime();
        System.out.println(end-start);

    }
}
/*
[23, 24, 25]
1121800
 */
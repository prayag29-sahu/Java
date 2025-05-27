
import java.util.LinkedHashSet;

class LinkHashSetUse{
    public static void main(String[] args) {
        LinkedHashSet<String> lset = new LinkedHashSet<>();
        lset.add("A");
        lset.add("B");
        lset.add("C");
        lset.add("A"); // A not print bcs hashset remove duplicates 
        lset.add("a");
        lset.add("D");
        System.out.println(lset);
    }
}
// [A, B, C, a, D] // not sort
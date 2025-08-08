
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetUses {

    public static void main(String[] args) {

        Set<Integer> nums = new HashSet<Integer>();

        nums.add(62);
        nums.add(54);
        nums.add(82);
        nums.add(21);

        //nums.add("5");
        Iterator<Integer> values = nums.iterator();

        while (values.hasNext()) {
            System.out.println(values.next());
        }

    }
}

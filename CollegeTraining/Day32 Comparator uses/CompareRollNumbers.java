
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompareRollNumbers {
    public static void main(String[] args) {
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                return i % 10 > j % 10 ? 1 : -1;
            }
        };
        ArrayList<Integer> rollNo = new ArrayList<>();
        rollNo.add(1142);
        rollNo.add(1155);
        rollNo.add(1137);
        rollNo.add(1121);
        Collections.sort(rollNo, com);
        System.out.println(rollNo);
    }
}
// sort by normal sorting
// [1121, 1137, 1147, 1155]
// after use on comparator
// [1121, 1142, 1155, 1137]
// sorted according to last digit
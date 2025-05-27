import java.util.*;

public class PrintDuplti {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 42, 4, 5, 3, 53, 45, 3, 5 };
        HashSet<Integer> set = new HashSet<>();
        set.contains(2);

        for (int i : arr) {
            if (set.contains(i)) {
                System.out.print(i+" ");
            }
            set.add(i);
        }
    }

}
// 2 3 5 

import java.util.HashSet;

public class RemoveDupli {
    public static void main(String[] args) {
        int[] arr = {1,2,2,42,4,5,3,53,45,3,5};
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println(set);
        set.contains(2);
        
    }
}
// [1, 2, 3, 4, 5, 53, 42, 45]
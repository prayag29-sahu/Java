
import java.util.HashSet;

public class Union {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,2,7,4};
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        System.out.println(set);
    }
}
// [1, 2, 3, 4, 5, 7]

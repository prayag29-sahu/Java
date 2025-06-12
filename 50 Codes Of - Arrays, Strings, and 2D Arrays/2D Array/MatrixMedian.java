
import java.util.Arrays;

public class  MatrixMedian {

    public static void main(String[] args) {
        int[][]  A = {
            {1, 3, 5},
            {2, 6, 9},
            {3, 6, 9}
        };
        int r =  A.length;
        int c =  A[0].length;
        int low = 1, high = 2000;
        while (low < high) {
            int mid = (low + high) / 2;
            int count = 0;
            for (int i = 0; i < r; i++) {
                count += Arrays.binarySearch( A[i], mid) >= 0
                        ? Arrays.binarySearch( A[i], mid) + 1
                        : -Arrays.binarySearch( A[i], mid) - 1;
            }
            if (count < (r * c + 1) / 2) {
                low = mid + 1; 
            }else {
                high = mid;
            }
        }
        System.out.println("Median is: " + low);
    }
}
// Median is: 5
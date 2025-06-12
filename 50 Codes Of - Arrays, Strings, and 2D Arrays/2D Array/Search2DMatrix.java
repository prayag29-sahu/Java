
public class Search2DMatrix {

    public static void main(String[] args) {
        int[][] A = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 50}
        };
        int target = 16;
        int m = A.length, n = A[0].length;
        int low = 0, high = m * n - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            int row = mid / n, col = mid % n;
            if ( A[row][col] == target) {
                found = true;
                break;
            } else if ( A[row][col] < target) {
                low = mid + 1; 
            }else {
                high = mid - 1;
            }
        }
        System.out.println(found ? "Found" : "Not Found");
    }
}
// Found

public class BoundaryTraversal {

    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        int n = A.length;
        int m = A[0].length;

        for (int i = 0; i < m; i++) {
            System.out.print(A[0][i] + " ");
        }
        for (int i = 1; i < n; i++) {
            System.out.print(A[i][m - 1] + " ");
        }
        if (n > 1) {
            for (int i = m - 2; i >= 0; i--) {
                System.out.print(A[n - 1][i] + " ");
            }
        }
        if (m > 1) {
            for (int i = n - 2; i > 0; i--) {
                System.out.print(A[i][0] + " ");
        
            }
        }
    }
}
// 1 2 3 4 8 12 11 10 9 5 
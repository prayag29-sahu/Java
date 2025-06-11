public class SnakePattern {

    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12}
        };

        int n = A.length;
        int m = A[0].length;

        System.out.println("Snake Pattern:");
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    System.out.print(A[i][j] + " ");
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    System.out.print(A[i][j] + " ");
                }
            }
        }
    }
}
// Snake Pattern:
// 1 2 3 6 5 4 7 8 9 12 11 10 
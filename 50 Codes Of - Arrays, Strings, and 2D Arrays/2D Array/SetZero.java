public class SetZero {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 9}
        };

        int m = A.length;
        int n = A[0].length;

        boolean[] row0 = new boolean[m];
        boolean[] col0 = new boolean[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] == 0) {
                    row0[i] = true;
                    col0[j] = true;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row0[i] || col0[j]) {
                    A[i][j] = 0;
                }
            }
        }

        System.out.println("Updated A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
/*
Updated A:
1       0       3
0       0       0
7       0       9
 */
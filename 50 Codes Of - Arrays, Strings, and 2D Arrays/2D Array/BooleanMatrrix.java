
public class BooleanMatrrix {

    public static void main(String[] args) {
        int[][] A = {
            {1, 0, 0},
            {0, 0, 0},
            {0, 0, 1}
        };
        int rows = A.length, cols = A[0].length;
        boolean[] row = new boolean[rows];
        boolean[] col = new boolean[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (A[i][j] == 1) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (row[i] || col[j]) {
                    A[i][j] = 1;
                }
            }
        }

        for (int[] r : A) {
            for (int c : r) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
/*
1 1 1 
1 0 1
1 1 1
 */
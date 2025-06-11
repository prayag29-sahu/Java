public class MatrixDiagonals {

    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = A.length;

        System.out.print("Primary Diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i][i] + " ");
        }

        System.out.println();

        System.out.print("Secondary Diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i][n - 1 - i] + " ");
        }
    }
}
/*
Primary Diagonal: 1 5 9 
Secondary Diagonal: 3 5 7 
 */
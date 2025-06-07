public class Transpose2Darr {
    public static int[][] transpose(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = A[i][j];
            }
        }

        return result;
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] A = {
            {1, 2},
            {3, 4},
            {5, 6}
        };

        int[][] transposed = transpose(A);
        System.out.println("Transposed Matrix:");
        printMatrix(transposed);
    }
}
/*
Transposed Matrix:
1 3 5
2 4 6
 */
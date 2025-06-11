import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter number of rows of Matrix A: ");
        // int m = sc.nextInt();
        // System.out.print("Enter number of columns of Matrix A / rows of Matrix B: ");
        // int n = sc.nextInt();

        // System.out.print("Enter number of columns of Matrix B: ");
        // int p = sc.nextInt();

        // int[][] A = new int[m][n];
        // int[][] B = new int[n][p];
        // int[][] C = new int[m][p];

        // System.out.println("\nEnter elements of Matrix A (" + m + "x" + n + "):");
        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //         A[i][j] = sc.nextInt();
        //     }
        // }

        // System.out.println("\nEnter elements of Matrix B (" + n + "x" + p + "):");
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < p; j++) {
        //         B[i][j] = sc.nextInt();
        //     }
        // }


        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] B = {{9,8,7},{6,5,4},{3,2,1}};
        int[][] C = new int[3][3];

        int m = A.length;
        int n = A[0].length;
        int p = n;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                C[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("\nResultant Matrix C (" + m + "x" + p + "):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
/*

Resultant Matrix C (3x3):
30      24      18
84      69      54
138     114     90


 */
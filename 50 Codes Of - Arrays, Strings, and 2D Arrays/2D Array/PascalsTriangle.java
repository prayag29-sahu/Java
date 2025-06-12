
public class PascalsTriangle {

    public static void main(String[] args) {
        int n = 5;
        int[][] pascal = new int[n][n];
        for (int i = 0; i < n; i++) {
            pascal[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*
1 
1 1 
1 2 1 
1 3 3 1 
1 4 6 4 1
 */
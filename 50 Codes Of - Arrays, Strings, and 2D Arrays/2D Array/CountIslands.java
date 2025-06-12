
public class CountIslands {

    static int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    static void dfs(char[][] A, int i, int j) {
        if (i < 0 || j < 0 || i >= A.length || j >= A[0].length || A[i][j] != '1') {
            return;
        }
        A[i][j] = '0';
        for (int[] d : dir) {
            dfs(A, i + d[0], j + d[1]);
        }
    }

    public static void main(String[] args) {
        char[][] A = {
            {'1', '1', '0', '0'},
            {'1', '0', '0', '1'},
            {'0', '0', '1', '1'}
        };
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] == '1') {
                    dfs(A, i, j);
                    count++;
                }
            }
        }
        System.out.println("Number of islands: " + count);
    }
}
// Number of islands: 2
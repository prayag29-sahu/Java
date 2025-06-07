public class FoundSortedMat {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        if (rows == 0) return false;
        int cols = matrix[0].length;

        int i = 0, j = cols - 1;

        while (i < rows && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16},
            {10, 13, 14, 17}
        };

        int target = 5;
        System.out.println("Found ? " + searchMatrix(matrix, target)); 

        target = 15;
        System.out.println("Found ? " + searchMatrix(matrix, target)); 
    }
}


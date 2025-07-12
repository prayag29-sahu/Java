
public class nestedloop {

    public static void main(String[] args) {
        int i = 0;
        while (i <= 5) {
            int j = 0;
            while (j <= 5) {
                System.out.print(" i: " + i + ", j: " + j);
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
/*
 i: 0, j: 0 i: 0, j: 1 i: 0, j: 2 i: 0, j: 3 i: 0, j: 4 i: 0, j: 5
 i: 1, j: 0 i: 1, j: 1 i: 1, j: 2 i: 1, j: 3 i: 1, j: 4 i: 1, j: 5
 i: 2, j: 0 i: 2, j: 1 i: 2, j: 2 i: 2, j: 3 i: 2, j: 4 i: 2, j: 5
 i: 3, j: 0 i: 3, j: 1 i: 3, j: 2 i: 3, j: 3 i: 3, j: 4 i: 3, j: 5
 i: 4, j: 0 i: 4, j: 1 i: 4, j: 2 i: 4, j: 3 i: 4, j: 4 i: 4, j: 5
 i: 5, j: 0 i: 5, j: 1 i: 5, j: 2 i: 5, j: 3 i: 5, j: 4 i: 5, j: 5
 */

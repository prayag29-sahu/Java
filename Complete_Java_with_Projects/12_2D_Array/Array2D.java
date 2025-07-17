
public class Array2D {

    public static void main(String[] args) {
        int[][] a = new int[4][];
        a[0] = new int[3];
        a[1] = new int[4];
        a[2] = new int[2];
        a[3] = new int[3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 100);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*
17 99 65 
77 48 63 23
6 48
40 42 90
 */
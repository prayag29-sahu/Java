public class Judged3D {
    public static void main(String[] args) {
        int[][][] a = new int[2][][];  
        
        a[0] = new int[3][];
        a[0][0] = new int[3];
        a[0][1] = new int[4];
        a[0][2] = new int[2];

        a[1] = new int[2][];
        a[1][0] = new int[2];
        a[1][1] = new int[3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    a[i][j][k] = (int)(Math.random() * 10);
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
/*
4 1 5 
5 4 5 7
1 1

4 3
8 5 1
 */
public class Arr {
    public static void main(String[] args) {
        int[][][] a = new int[2][3][3];
        // a[0][0] = new int[3];
        // a[0][1] = new int[3];
        // a[0][2] = new int[3];
        // a[1][0] = new int[3];
        // a[1][1] = new int[3];
        // a[1][2] = new int[3];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a[i][j].length;k++){
                    a[i][j][k]=(int)(Math.random()*100);
                    System.out.print(a[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
/*
94 12 5 
43 62 22
72 0 68

16 56 94
35 20 1
83 42 15

 */
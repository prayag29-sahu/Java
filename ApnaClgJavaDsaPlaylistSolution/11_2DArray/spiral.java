import java.util.*;

public class spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an size of an 2D array : ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] a = new int[n][m];

        // print an 2D array
        System.out.println("Enter an elements of an array : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("The spiral order of an array : ");
        int cs = 0;
        int ce = m-1;
        int rs = 0;
        int re = n-1;
        System.out.println("The Spiral Order Matrix is : ");

        while(rs<=re&&cs<=ce)
        {
        for(int i=cs; i<=ce; i++) {
            System.out.print(a[rs][i] + " ");
        }
        rs++;
        for(int j=rs; j<=re; j++) {
            System.out.print(a[j][ce] +" ");
        }
        ce--;
        for(int i=ce; i>=cs; i--) {
            System.out.print(a[re][i] + " ");
        }
        re--;
        for(int j=re; j>=rs; j--) {
            System.out.print(a[j][cs] + " ");
        }
        cs++;
        System.out.println();
        }

        sc.close();
    }
}

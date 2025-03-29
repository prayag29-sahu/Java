import java.util.*;

public class array2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] a = new int[n][m];

        // print an 2D array
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


        // search an elements
        // int found = 0;
        // int search = sc.nextInt();
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<m;j++)
        //     {
        //         a[i][j]=sc.nextInt();
        //     }
        // }
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<m;j++)
        //     {
        //         if(a[i][j]==search)
        //         {
        //             found = 1;
        //             System.out.println("Find : "+search+" at index i = "+i+" j ="+j);
        //         }
        //     }
        // }
        // if(found==0){
        //     System.out.println("Not Found.");
        // }

        // transpose  order of 2d array
        // for(int j=0;j<n;j++)
        // {
        //     for(int i=0;i<m;i++)
        //     {
        //         System.out.print(a[i][j]+" ");
        //     }
        //     System.out.println();
        // }


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

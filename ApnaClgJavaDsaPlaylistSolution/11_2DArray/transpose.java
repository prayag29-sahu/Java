import java.util.*;

public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an 2d array : ");
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

        // transpose  order of 2d array
        System.out.println("The transpose order of an array was : ");
        for(int j=0;j<n;j++)
        {
            for(int i=0;i<m;i++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}

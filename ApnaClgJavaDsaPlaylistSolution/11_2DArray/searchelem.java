import java.util.*;

public class searchelem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] a = new int[n][m];

        // search an elements
        System.out.println("Enter an elements of an array : ");
        int found = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter an element to search : ");
        int search = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j]==search)
                {
                    found = 1;
                    System.out.println("Find : "+search+" at index i = "+i+" j ="+j);
                }
            }
        }
        if(found==0){
            System.out.println("Not Found.");
        }

        sc.close();
    }
}

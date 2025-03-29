public class bigOofnandm {
    public static void main(String[] args) {

        int n=4;
        int m=4;

        // complexity O(n+m) = O(n) or O(m)  worst case
        for(int i=1;i<=n;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        for(int j=1;j<=m;j++)
        {
            System.out.print(j+" ");
        }
    }
}

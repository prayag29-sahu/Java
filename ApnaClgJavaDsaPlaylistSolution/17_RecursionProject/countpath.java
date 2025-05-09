
public class countpath {
    public static int path(int i,int j,int m,int n)
    {
        if(i==m-1||j==n-1)
        {
            return 1;
        }
        return path(i+1, j, m, n)+path(i, j+1, m, n);
    }
    public static void main(String[] args) {
        int m=3;
        int n=3;
        System.out.println(path(0,0,m,n));
    }
    
}

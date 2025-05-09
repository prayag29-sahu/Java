
public class tiling {
    public static int place(int n,int m)
    {

        if(n<m)
        {
            return 1;
        }else if(n==m)
        {
            return 2;
        }
        return place( n-1, m)+place( n-m, m);
    }
    public static void main(String[] args) {
        int n=4;
        int m=2;
        System.out.println(place(n,m));
    }
    
}

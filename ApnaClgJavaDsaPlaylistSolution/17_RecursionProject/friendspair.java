
public class friendspair {
    public static int pair(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        return pair(n-1)+(n-1)*pair(n-2);
    }
    public static void main(String args[])
    {
        int num = 4;
        System.out.println(pair(num));
    }
    
}

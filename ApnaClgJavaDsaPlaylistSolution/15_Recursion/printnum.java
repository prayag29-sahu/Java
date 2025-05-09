
public class printnum {
    public static void print(int num)
    {
        if(num==6)
        {
            return;
        }
        System.out.print(num + " ");
        print(num+1);
    }
    public static void main(String[] args) {
        int num=1;
        print(num);
        
    }
    
}

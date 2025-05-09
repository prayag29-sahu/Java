
public class printnumrev {
    public static void printnum(int num)
    {
        if(num==0)
        {
            return;
        }
        System.out.print(num + " ");
        printnum(num-1);
    }
    public static void main(String[] args) {
        int num=5;
        printnum(num);
        
    }
    
}

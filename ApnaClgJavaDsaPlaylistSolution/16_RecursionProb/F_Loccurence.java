
public class F_Loccurence {

    public static int first = -1;
    public static int last = -1;
    public static void occur(String str,char ch, int index)
    {
        if(index == str.length())
        {
            return;
        }
        if(str.charAt(index)==ch)
        {
            if(first==-1)
            {
                first=index;
            }
            else
            {
                last = index;
            }
        }
        occur(str, ch, index+1);

    }
    public static void main(String args[])
    {
        String str = "Prayag";
        occur(str,'a', 0);
        System.out.println("The First Occure alphabate at index : "+first+1);
        System.out.println("The Last Occure alphabate at index : "+last+1);
    }
    
}

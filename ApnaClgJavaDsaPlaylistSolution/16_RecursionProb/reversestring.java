
public class reversestring {
    public static void reverse(String str,String str1, int index)
    {
        if(str.length()==str1.length()-1)
        {
            System.out.println(str1);
            return ;
        }
        str1 = str1 + str.charAt(index);
        reverse(str, str1, index-1);
    }

    public static void main(String args[])
    {
        String str = "Prayag";
        String str1 =" ";
        reverse(str, str1, str.length()-1);
    }
    
}

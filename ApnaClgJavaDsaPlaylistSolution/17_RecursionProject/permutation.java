
public class permutation {
    public static void printperm(String str,int idx,String perm)
    {
        if(str.length()==0)
        {
            System.out.print(perm+" ");
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            String newstr = str.substring(0,i)+str.substring(i+1);
            printperm(newstr, idx+1, perm+ch);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printperm(str,0,"");
    }
    
}

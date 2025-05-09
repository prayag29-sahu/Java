public class removerepetation {

    public static String remove(String str,int index,int a[])
    {
        if(index==str.length())
        {
            return "";
        }
        if(a[str.charAt(index)-'a']==1)
        {
            return remove(str, index+1, a);
        } else{
            a[str.charAt(index)-'a']=1;
            return str.charAt(index)+remove(str, index+1, a);
        }
    }
    public static void main(String args[])
    {
        String str = "abfabsada";
        // boolean p[] = new boolean[26];
        int[] a = new int[26];
        for(int i=0;i<26;i++){
            a[i]=0;
        }

        System.out.println("After Remove repeated alpha string is : "+remove(str, 0, a));
    }
    
}

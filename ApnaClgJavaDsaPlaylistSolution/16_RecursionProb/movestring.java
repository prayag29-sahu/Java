public class movestring {

    public static void move(String str,String str1,int index, int count)
    {
        if(index==str.length())
        {
            for(int i=0;i<count;i++){
                str1+='a';
            }
            System.out.println("The new string is : "+str1);
            return;
        }
        if(str.charAt(index)=='a')
        {
            count++;
        }else{
            str1=str1+str.charAt(index);
        }
        move(str, str1, index+1, count);
    }
    public static void main(String args[]) {
        String str = "abbsasdaab";
        String str1 = " ";
        move(str,str1,0,0);
    }
    
}

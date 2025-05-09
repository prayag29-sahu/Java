public class keypad {
    public static   String keypad[] = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printkeypad(  String  num,int idx,  String res)
    {
        if(idx== num.length())
        {
            System.out.println(res);
            return;
        }
        for(int i=0;i<keypad[ num.charAt(idx)-'0'].length();i++)
        {
            char curr = keypad[ num.charAt(idx)-'0'].charAt(i);
            printkeypad( num,idx+1,res+curr);

        }
        
    }
    public static void main(  String[] args) {
        String  num = "23";
        printkeypad( num,0,"");
    }
    
}

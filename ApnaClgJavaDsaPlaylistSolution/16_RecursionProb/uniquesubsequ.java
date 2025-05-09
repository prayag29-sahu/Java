import java.util.HashSet;
public class uniquesubsequ {
    public static void subseq(String str,int idx,String res,HashSet<String> allseq)
    {
        if(idx==str.length())
        {
            if(allseq.contains(res)){
            return;
            }
        
        allseq.add(res);
        System.out.println(res);
        return;
        }
        subseq(str, idx+1, res+str.charAt(idx), allseq);

        subseq(str, idx+1, res, allseq);
    }
    public static void main(String[] args) {
        String str = "123";
        HashSet<String> allseq = new HashSet<>();
        subseq(str,0,"",allseq);
    }
    
}
